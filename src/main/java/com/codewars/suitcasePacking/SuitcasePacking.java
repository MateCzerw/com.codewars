package com.codewars.suitcasePacking;

public class SuitcasePacking {
    public static Boolean fit_in(int a, int b, int m, int n) {
        return Math.max(m,n) >= a + b
                && Math.min(m,n) >= Math.max(a,b);
    }
}
