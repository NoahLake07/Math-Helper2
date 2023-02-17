package com.mathhelper.test;

import com.mathhelper.data.groups.DualNum;
import com.mathhelper.operations.Factor;

public class DualNumTests {

    public static void main(String[] args) {
        DualNum x = new DualNum(3,9);

        System.out.println(x.b +": "+Factor.basicFactorize(9));
    }

}
