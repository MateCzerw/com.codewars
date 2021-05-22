package com.codewars.rainfall;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Rainfall {
    public static double mean(String town, String data) {

        Map<String, Map<String, Double>> statsForCities = generateData(data);
        if(!statsForCities.containsKey(town)) return -1d;
        Map<String, Double> statsForMonths = statsForCities.get(town);


        return statsForMonths
                .entrySet()
                .stream()
                .map(i -> i.getValue())
                .reduce(0d,(aDouble, aDouble2) -> {
                    return aDouble + aDouble2;
                }) / 12;
    }
    public static double variance(String town, String data) {
        Map<String, Map<String, Double>> statsForCities = generateData(data);
        if(!statsForCities.containsKey(town)) return -1d;
        Map<String, Double> statsForMonths = statsForCities.get(town);

        final double mean = statsForMonths
                .entrySet()
                .stream()
                .map(i -> i.getValue())
                .reduce(0d,(aDouble, aDouble2) -> {
                    return aDouble + aDouble2;
                }) / 12;


        return statsForMonths
                .entrySet()
                .stream()
                .map(i -> Math.pow(i.getValue() - mean, 2))
                .reduce(0d,(aDouble, aDouble2) -> {
                    return aDouble + aDouble2 ;
                }) / 12;
    }

    public static Map<String, Map<String, Double>> generateData(String data){

        String[] rows = data.split("\n");
        Map<String, Map<String, Double>> results = new HashMap<>();

        for (int i = 0; i < rows.length ; i++) {
            int cityNameLength = rows[i].indexOf(":");
            String cityName = rows[i].substring(0, cityNameLength);
            Map<String, Double> months = Arrays
                    .stream(rows[i].substring(cityNameLength + 1).split(","))
                    .collect(Collectors
                            .toMap(month -> month.substring(0,3), month -> Double.valueOf(month.substring(4))));
            results.put(cityName, months);
        }
        return results;
    }


}
