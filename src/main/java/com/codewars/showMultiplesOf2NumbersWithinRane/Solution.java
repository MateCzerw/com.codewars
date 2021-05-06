package com.codewars.showMultiplesOf2NumbersWithinRane;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static List<Integer> findMultiples(int s1, int s2, int s3) {

        return  IntStream
                .range(1,s3)
                .filter(number -> number % s1 == 0 && number % s2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
