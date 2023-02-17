package com.mathhelper.operations;

import com.mathhelper.data.groups.DualNum;

import java.util.ArrayList;

public class Factor {

    public static ArrayList<Integer> findPrimeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
                factors.addAll(findPrimeFactors(number / i));
                break;
            }
        }

        return factors;
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

}
