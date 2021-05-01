package com.codewars.mergedStringChecker;

import java.util.Arrays;

public class MergedStringChecker {

    public static boolean isMerge(String requiredString, String part1, String part2) {

        boolean isAllLettersFromPart1removed = deleteLettersFromWord(requiredString, part1);
        boolean isAllLettersFromPart2removed = deleteLettersFromWord(requiredString, part2);
        boolean isRequiredStringEmpty = requiredString.isEmpty();

        return isAllLettersFromPart1removed
                && isAllLettersFromPart2removed
                && isRequiredStringEmpty;
    }

    private static boolean deleteLettersFromWord(String requiredString, String lettersToRemove){
        int index = 0;

        for (int i = 0; i < lettersToRemove.length(); i++) {
            char letter = lettersToRemove.charAt(i);
            if(requiredString.indexOf(letter,index) >= 0) {
                index = requiredString.indexOf(letter,index);
                requiredString = requiredString.substring(0,i) + " " + requiredString.substring(i);
            }
            else return false;
        }

        return true;
    }


}
