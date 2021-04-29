package com.codewars.convertStringToCamelCase;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ToCamelCase {
    static String toCamelCase(String s){


        String[] splitSentence = s.split("[-_]");


        for (int i = 0; i < splitSentence.length; i++) {
            if(i != 0 && splitSentence[i].length() != 0)
                splitSentence[i] =
                        splitSentence[i].substring(0, 1).toUpperCase() +
                                splitSentence[i].substring(1);
        }

        return Arrays.stream(splitSentence).collect(Collectors.joining());
    }


}
