package com.codewars.sortArrays1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortArrays {
    public static<T> Object[] sortArray(T[] names){
        return Arrays
                .stream(names)
                .sorted()
                .toArray();
    }

}
