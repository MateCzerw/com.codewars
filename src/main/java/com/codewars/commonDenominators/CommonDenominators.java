package com.codewars.commonDenominators;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CommonDenominators {
    public static String convertFrac(long[][] lst) {
        for (int i = 0; i < lst.length ; i++) {
            long gdc = gdc(lst[i][0], lst[i][1]);
            lst[i][0] = lst[i][0] / gdc;
            lst[i][1] = lst[i][1] / gdc;
        }

        Long commonDenominator = lst[0][1];
        if(lst.length == 0) return "";


        for (int i = 1; i < lst.length ; i++) {
            commonDenominator = lcm(lst[i][1], commonDenominator);
        }

        for (int i = 0; i < lst.length ; i++) {
            long gdc = gdc(lst[i][0], lst[i][1]);
            lst[i][0] = lst[i][0] / gdc;
            lst[i][1] = lst[i][1] / gdc;
        }

        for (int i = 0; i < lst.length ; i++) {
            lst[i][0] = lst[i][0] * (commonDenominator / lst[i][1]);
            lst[i][1] = commonDenominator;
        }

        return Arrays.stream(lst)
                .map(i -> String.format("(%d,%d)",i[0],i[1]))
                .collect(Collectors.joining());
    }


    private static long lcm(long a, long b) {

        return gdc(a,b) != 0 ? a * b / gdc(a,b) : 0;
    }

    private static long gdc(long a, long b) {
        if(a == 0) return b;
        if(b == 0) return a;

        return gdc(b, a % b);
    }

}
