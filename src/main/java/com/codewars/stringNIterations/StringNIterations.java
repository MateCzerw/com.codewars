package com.codewars.stringNIterations;

import java.util.stream.IntStream;

public class StringNIterations {

    public static String jumbledString(String word, long n) {
        int wordLength = word.length();
        int cycleLength = findCycleLength(wordLength);
        int numberOfRotations = (int)(n % cycleLength);

        int[] result = IntStream
                .range(0,wordLength - 1)
                .toArray();

        for (int i = 0; i < numberOfRotations; i++) {

        }

        return "";
    }

    private static int findCycleLength(int wordLength) {
        int cycleLength = 1;
        int temp = (wordLength / 2) + 1;

        while (temp != 1){
            if(temp % 2 == 0) temp /= 2;
            else temp = (wordLength / 2) + (temp / 2) + 1;
        }

        return cycleLength;
    }
//https://www.codewars.com/kata/5ae43ed6252e666a6b0000a4/train/java

}
