package com.codewars.sortTheOdd;


import java.util.*;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        List<Integer> sortedOddNumbers = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 1) {
                sortedOddNumbers.add(array[i]);
                array[i] = -1;
            }
        }

        sortedOddNumbers.sort(Comparator.comparing(Integer::intValue));

        for (int i = 0; i < array.length; i++) {
            if(array[i] == -1) {
                array[i] = sortedOddNumbers.get(0);
                sortedOddNumbers.remove(0);
            }
        }
        return array;
    }
}
