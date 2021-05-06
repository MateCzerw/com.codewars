package com.codewars.throwingCoins;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;

public class ThrowingCoins {
    public String[] coin(int n) {
        Set<String> results = new TreeSet<>(String::compareTo);

        throwCoins("H", n, results);
        throwCoins("T", n, results);

        String[] array = new String[results.size()];
        int k = 0;
        for (String result: results) {
            array[k++] = result;
        }

        return array;
    }

    private void throwCoins(String throwCoinResult, int n, Set<String> results)
    {
        if(throwCoinResult.length() == n) {
            results.add(throwCoinResult);
            return;
        }
        throwCoins(throwCoinResult + "H", n, results);
        throwCoins(throwCoinResult + "T", n, results);
    }

}
