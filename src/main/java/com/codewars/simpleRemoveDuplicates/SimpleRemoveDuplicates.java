package com.codewars.simpleRemoveDuplicates;

import java.util.*;
import java.util.stream.IntStream;

public class SimpleRemoveDuplicates {
    public static int[] solve(int [] arr){

        Set<Integer> reversedSet = new LinkedHashSet<>();

        IntStream
                .range(0, arr.length)
                .map(i -> arr[arr.length -1 - i])
                .boxed()
                .forEach(i -> reversedSet.add(i));

        List<Integer> list = new LinkedList<>(reversedSet);
        Collections.reverse(list);


        return list
                .stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
