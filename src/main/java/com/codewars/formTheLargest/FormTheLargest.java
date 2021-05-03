package com.codewars.formTheLargest;


import java.util.Comparator;

public class FormTheLargest {
    public static long maxNumber(long n) {
        return String
                .valueOf(n)
                .chars()
                .mapToObj(digit -> digit - 48)
                .sorted(Comparator.reverseOrder())
                .reduce(0, (a,b) ->  10 * a +  b);
    }
}
