package com.mathhelper.operations;

import java.util.ArrayList;

public class DataMerge<T> {

    public static ArrayList<Integer> mergeList(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> merged = a;
        merged.addAll(b);

        return merged;
    }

}
