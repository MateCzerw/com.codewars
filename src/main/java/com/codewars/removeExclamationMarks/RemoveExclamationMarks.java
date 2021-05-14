package com.codewars.removeExclamationMarks;

import java.util.stream.Collectors;

public class RemoveExclamationMarks {

    static String removeExclamationMarks(String s) {
        return  s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != '!')
                .map(c -> "" + c)
                .collect(Collectors.joining());
    }
}
