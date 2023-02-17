package com.mathhelper.data.groups;

import com.mathhelper.operations.Factor;

public class DualNum {

    public int a,b;

    public DualNum(int a, int b){
        this.a = a;
        this.b = b;
    }

    public String toString(){
        return "[" + a + ", " + b + "]";
    }

    public boolean equals(DualNum dualNum){
        return dualNum.a == this.a && dualNum.b == this.b;
    }

    public boolean contains(int i){
        return this.b == i || this.a == i;
    }

    public boolean isOppositeOf(DualNum dualNum){
        return dualNum.a == this.b && dualNum.b == this.a;
    }

    public boolean canSimplify(){
        return Factor.basicFactorize(this.a) != null && Factor.basicFactorize(this.b) != null;
    }

    /**
     * @param index
     * @return if the index specified can be simplified, it returns true. If the index is
     * invalid, an error is thrown and returns false. If the index specified is already
     * simplified, it returns false.
     */
    public boolean canSimplify(int index){
        if (index >= 0 && index <=1){
            if(index==0){
                return !(Factor.basicFactorize(this.a,false).size()<1);
            } else {
                 return !(Factor.basicFactorize(this.b,false).size()<1);
            }
        } else{
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds. Only indexes 0-1 are valid in a DualNum object.");
        }
    }

    public int compareTo(DualNum dualNum){
        if(dualNum.a > this.a && dualNum.b > this.b){
            return 1;
        } else {
            if (dualNum.equals(this)){
                return 0;
            } else {
                return -1;
            }
        }
    }

}
