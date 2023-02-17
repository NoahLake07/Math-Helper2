package com.mathhelper.operations;

import com.mathhelper.data.groups.DualNum;

import java.util.ArrayList;

public class Factor {

    public static DualNum findGCF(int num){
        return null;
    }


    public static ArrayList<Integer> factorize(int num){
        DualNum split = null;

        // get all possible factors
        for (int i = num; i > 0; i--) {
            if(num%i==0){
                split = new DualNum(i,num/i);
            }
        }

        ArrayList<Integer> factors = new ArrayList<>();

        if(split.canSimplify()){
            factors = DataMerge.mergeList(factorize(split.a), factorize(split.b));
            return factors;
        } else {
            return factors;
        }
    }

    public static ArrayList<DualNum> basicFactorize(int num){
        ArrayList<DualNum> factors = new ArrayList<>();

        // get all possible factors
        for (int i = num; i > 0; i--) {
            if(num%i==0){
                factors.add(new DualNum(i,num/i));
            }
        }

        // remove duplicates
        for (int i = 0; i < factors.size(); i++) {
            for (int j = 0; j < factors.size(); j++) {
                if(factors.get(i).isOppositeOf(factors.get(j))){
                    factors.remove(j);
                }
            }
        }

        return factors;
    }

    public static ArrayList<DualNum> basicFactorize(int num, boolean allowOnes){
        ArrayList<DualNum> factors = new ArrayList<>();

        // get all possible factors
        for (int i = num; i > 0; i--) {
            if(num%i==0){
                DualNum factor = new DualNum(i,num/i);
                if(allowOnes && factor.contains(1)) {
                    factors.add(factor);
                }
            }
        }

        // remove duplicates
        for (int i = 0; i < factors.size(); i++) {
            for (int j = 0; j < factors.size(); j++) {
                if(factors.get(i).isOppositeOf(factors.get(j))){
                    factors.remove(j);
                }
            }
        }

        return factors;
    }

}
