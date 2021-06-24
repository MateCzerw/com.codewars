package com.codewars.consecutiveStrings;

import java.util.LinkedList;
import java.util.List;

public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        if(strarr.length < k) return "";
        List<String> consecutiveStrings = new LinkedList<>();
        for (int i = 0; i < strarr.length - k + 1; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < k; j++) {
                sb.append(strarr[i + j]);
            }
            consecutiveStrings.add(sb.toString());
        }
        int maxLength = consecutiveStrings.stream()
                .mapToInt(e -> e.length())
                .max()
                .orElse( 0);

        return consecutiveStrings.stream()
                .filter(e -> e.length() == maxLength)
                .findFirst()
                .orElse("");
    }
}
