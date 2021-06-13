package com.codewars.getMeanOFArray;

import java.util.Arrays;

public class GetMeanOFArray {
    public static int getAverage(int[] marks){
        return (int) Arrays
                .stream(marks)
                .average()
                .orElse(0);
    }
}
