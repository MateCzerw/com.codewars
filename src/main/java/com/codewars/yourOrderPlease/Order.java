package com.codewars.yourOrderPlease;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Order {
    public static String order(String words) {

        if(words.equals("")) return "";
        Map<Integer,String> results  = new TreeMap();

        String[] disorderedWords = words.split(" ");

        List<Integer> listOfWordsPosition = Arrays.stream(disorderedWords)
                .map(e -> e.replaceAll("[^1-9]", ""))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        for (int i = 0; i < disorderedWords.length; i++) {
            results.put(listOfWordsPosition.get(i), disorderedWords[i]);
        }

        return results.values().stream().collect(Collectors.joining(" "));
    }
}
