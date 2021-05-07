package com.codewars.differenceOf2;

import java.util.*;

public class DifferenceOf2 {
    public static int[][] twosDifference(int[] array) {

        // sort of elements
        Set<Integer> sortedSet = new TreeSet<>();

        Arrays.stream(array)
                .forEach(number -> sortedSet.add(number));

        Set<List<Integer>> setOfPairs = new LinkedHashSet<>();
        // pairs creation
        for (Integer number: sortedSet) {
            if(sortedSet.contains(number + 2)) setOfPairs.add(List.of(number,number + 2));
        }

        int[][] resultArray = new int[setOfPairs.size()][2];

        // set to 2-dimensional array conversion
        int iteratorNumber = 0;
        for (List<Integer> pair : setOfPairs) {
            resultArray[iteratorNumber][0] = pair.get(0);
            resultArray[iteratorNumber][1] = pair.get(1);
            iteratorNumber++;
        }

        return resultArray;
    }
}
