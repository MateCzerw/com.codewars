package com.codewars.sumDifferencesBetweenProductsandLCMs;

import java.util.Arrays;

public class Solution {
    public static int sumDifferencesBetweenProductsAndLCMs(final int[][] pairs)
    {
        return Arrays
                .stream(pairs)
                .map(e -> e[0] * e[1] - lcm(e[0] , e[1]))
                .reduce( Integer::sum)
                .orElse(0);
    }

    private static int lcm(int a, int b) {

        return gdc(a,b) != 0 ? a * b / gdc(a,b) : 0;
    }

    private static int gdc(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;

        return gdc(b, a % b);
    }
}
