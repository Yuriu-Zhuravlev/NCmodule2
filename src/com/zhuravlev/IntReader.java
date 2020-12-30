package com.zhuravlev;

import java.io.*;

public class IntReader {
    public static int[] read(File file) {
        int[] result = new int[0];
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String fromFile = reader.readLine();
            String[] subStr;
            subStr = fromFile.split(" ");
            int length = subStr.length;
            result = new int[length];
            for (int i = 0; i < length; i++)
                result[i] = Integer.parseInt(subStr[i]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
