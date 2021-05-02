package com.codewars.prizeDraw;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrizeDraw {
    public static String nthRank(String st, Integer[] we, int n) {
        String[] names = st.split("[,]");
        if (st.isEmpty()) return "No participants";
        if (names.length < n) return "Not enough participants";


        List<Integer> values = IntStream.range(0, names.length)
                .mapToObj(e -> calculateValue(names[e], we[e]))
                .collect(Collectors.toList());

        Map<String, Integer> result = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            result.put(names[i], values.get(i));
        }

        LinkedHashMap<String, Integer> sortedResult = result.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue((o1, o2) -> o2.compareTo(o1))
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        int number = 0;
        for (Map.Entry<String, Integer> entry : sortedResult.entrySet()) {
            if(number == n - 1) return entry.getKey();
            number++;
        }
        return "";
    }

    private static int calculateValue(String name, int multiplier) {

        return name
                .toLowerCase()
                .chars()
                .map(letter -> (letter - 96) * multiplier)
                .sum() + name.length() * multiplier;
    }

}
