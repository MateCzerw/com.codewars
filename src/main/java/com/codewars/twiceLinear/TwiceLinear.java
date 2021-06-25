package com.codewars.twiceLinear;

import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TwiceLinear {
    public static int dblLinear(int n) {
        SortedSet<Integer> results = new TreeSet<>();
        results.add(1);

        for (int i = 0; i < n; i++) {
            int x = results.first();
            results.add( 2 * x + 1);
            results.add( 3 * x + 1);
            results.remove(x);
        }

        return results.first();
    }
}