package com.codewars.strangeMathematics;

import java.util.LinkedList;
import java.util.List;

public class StrangeMathematics {
    public static int mathematics(int n, int k){
        List<String> listOfNumbers = new LinkedList<>();
        for (int i = 0; i <= n; i++) {
            listOfNumbers.add(String.valueOf(i));
        }
        listOfNumbers.sort(String::compareTo);
        return listOfNumbers.indexOf(String.valueOf(k));
    }
}
