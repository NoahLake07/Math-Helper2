package com.mathhelper.test;

import com.mathhelper.operations.DataMerge;

import java.util.ArrayList;

public class MergeTest {

    public static void main(String[] args) {

        ArrayList<Integer> a, b;
        a = new ArrayList<>();
        b = new ArrayList<>();

        a.add(1);
        a.add(2);

        b.add(3);
        b.add(4);

        System.out.println(DataMerge.mergeList(a,b));
    }

}
