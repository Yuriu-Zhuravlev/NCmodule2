package com.zhuravlev;

import java.util.*;

public class ArrayManipulator {
    public static Set noRepetitions(int[] input){
        Set result = new HashSet();
        for(int i: input){
            result.add(i);
        }
        return result;
    }

    public static List even (int[] input){
        List result = new ArrayList();
        for (int i: input){
            if ( i % 2 == 0 )
                result.add(i);
        }
        return result;
    }

    public static Map<String,Integer> pairs (int[] input) {
        Map<String,Integer> result = new TreeMap<>();
        for (int i = 0; i < input.length; i++){
            result.put((i+1) + " element",input[i]);
        }
        return result;
    }
}
