package com.codewars.whichAreIn;

import java.util.Arrays;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(word -> isInsideArray2(word,array2))
                .sorted()
                .toArray(String[]::new);
    }

    private static boolean isInsideArray2(String wordToCheck, String[] array2){
        for (String wordFromArray2: array2) {
            if(wordFromArray2.contains(wordToCheck)) return true;
        }
        return false;
    }

}
