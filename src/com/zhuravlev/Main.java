package com.zhuravlev;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        File file = new File("document.txt");
        int[] input = IntReader.read(file);
        Set noRepeats = ArrayManipulator.noRepetitions(input);
        List even = ArrayManipulator.even(input);
        Map<String,Integer> pairs = ArrayManipulator.pairs(input);
        System.out.println("To get array without repeats write noRepeat");
        System.out.println("To get array of even numbers write even");
        System.out.println("To get pairs n element - array[n-1] write pair");
        System.out.println("To end program write quit");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while (!s.equals("quit")){
            switch (s){
                case "noRepeat" :
                    for(Object o: noRepeats){
                        System.out.print(o + " ");
                    }
                    System.out.println();
                    break;
                case "even" :
                    for(Object o: even){
                        System.out.print(o + " ");
                    }
                    System.out.println();
                    break;
                case "pair":
                    for(Map.Entry<String,Integer> entry: pairs.entrySet()){
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    break;
            }
            s = in.nextLine();
        }
    }
}
