package com.codewars.powerOf2;

import java.util.stream.IntStream;

public class PowerOf2 {
    public static long[] powersOfTwo(int n){

        return IntStream
                .range(0,n + 1)
                .boxed()
                .map(i -> (long) Math.pow(2,i))
                .mapToLong(i -> i)
                .toArray();
    }
}
