package com.codewars.findTheSquares;

public class FindTheSquares {
    public static String findSquares(final int n) {
        final long a = (n + 1) / 2;
        final long b = a - 1;
        return String.format("%d-%d", a * a, b * b);
    }
}
