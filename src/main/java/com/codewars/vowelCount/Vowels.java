package com.codewars.vowelCount;

public class Vowels {
    public static int getCount(String str) {
        String vowels = "aeiou";

        return (int) str.chars()
                .mapToObj(c -> (char) c)
                .filter(e -> vowels.contains(String.valueOf(e)))
                .count();

    }
}
