package com.codewars.directionsReduction;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DirectionsReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> resultList = new LinkedList<>(Arrays.asList(arr));
        for (int i = 0; i < resultList.size(); i++) {
            if (i + 1 < resultList.size()
                    && resultList.get(i)
                    .equals(oppositeDirection(resultList.get(i + 1)))) {
                resultList.remove(i);
                resultList.remove(i);
                i = Math.max(i - 2, -1);
            }
        }
        return resultList.stream()
                .toArray(String[]::new);
    }

    private static String oppositeDirection(String direction) {
        switch (direction) {
            case "NORTH":
                return "SOUTH";
            case "SOUTH":
                return "NORTH";
            case "EAST":
                return "WEST";
            case "WEST":
                return "EAST";
            default:
                throw new IllegalArgumentException();
        }
    }

}
