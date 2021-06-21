package com.codewars.lookingForBenefactor;

import java.util.stream.IntStream;

public class LookingForBenefactor {
    public static long newAvg(double[] arr, double navg)
    {
        double sum = IntStream
                .range(0, arr.length)
                .mapToDouble(e -> arr[e])
                .sum();

        if( sum / arr.length > navg ) throw new IllegalArgumentException();
        return   (long)(Math.ceil(navg * (arr.length + 1) - sum));
    }
}
