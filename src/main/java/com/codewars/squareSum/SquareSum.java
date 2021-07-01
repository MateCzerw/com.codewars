package com.codewars.squareSum;

import java.util.Arrays;

public class SquareSum {
    public static int squareSum(int[] n)
    {
        return Arrays.stream(n)
                    .map(e-> (int) Math.pow(e,2))
                    .sum();
    }
}
