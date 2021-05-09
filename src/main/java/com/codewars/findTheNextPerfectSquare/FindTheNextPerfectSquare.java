package com.codewars.findTheNextPerfectSquare;

public class FindTheNextPerfectSquare {
    public static long findNextSquare(long sq) {
        return Math.sqrt(sq) % 1 != 0 ? -1 : (long) Math.pow(Math.sqrt(sq) + 1, 2);
    }
}

