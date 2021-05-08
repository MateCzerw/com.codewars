package com.codewars.shorterConcat;

public class ShorterConcat {

    public static String shorterReverseLonger(String a, String b) {

        String shorter = a.length() < b.length() ? a : b;
        String longer = a.length() >= b.length() ? a : b;
        StringBuilder sb  = new StringBuilder();
        String reversedString = new StringBuilder(longer)
                                    .reverse()
                                    .toString();
        return sb
                .append(shorter)
                .append(reversedString)
                .append(shorter)
                .toString();

    }
}
