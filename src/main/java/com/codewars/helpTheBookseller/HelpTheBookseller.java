package com.codewars.helpTheBookseller;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HelpTheBookseller {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if(lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";
        Map<String, Integer> result = new LinkedHashMap<>();
        Arrays.stream(lstOf1stLetter)
                .forEach(e -> result.put(e,0));

        Arrays.stream(lstOfArt)
                .forEach(e -> {
                    String key = String.valueOf(e.charAt(0));
                    int number = Integer.parseInt(e.substring(e.lastIndexOf(' ') + 1));
                    if(result.containsKey(key)){
                        result.put(key,result.get(key) + number);
                    }
                });

        return result.entrySet().stream()
                .map(e -> String.format("(%s : %d)",e.getKey(),e.getValue()))
                .collect(Collectors.joining(" - "));
    }
}
