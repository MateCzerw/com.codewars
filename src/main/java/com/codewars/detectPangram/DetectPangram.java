package com.codewars.detectPangram;

import java.util.Locale;

public class DetectPangram {
    public boolean check(String sentence){
        int numberOfDistinctLetters = (int) sentence
                .toLowerCase()
                .replaceAll("[^a-z]", "")
                .chars()
                .distinct()
                .count();
        return numberOfDistinctLetters == 26;
    }
}
