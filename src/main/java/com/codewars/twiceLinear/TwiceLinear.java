package com.codewars.twiceLinear;

import java.util.LinkedList;
import java.util.List;

public class TwiceLinear {
    public static int dblLinear(int n) {
        List<Integer> results = new LinkedList<>();
        results.add(1);
        int x = 0;
        int y = 0;
        while (results.size() <= n) {
            int a = 2 * results.get(x) + 1;
            int b = 3 * results.get(y) + 1;

            if (a > b) {
                results.add(b);
                y++;
            } else if (a < b) {
                results.add(a);
                x++;
            } else {
                results.add(a);
                x++;
                y++;
            }
        }
        return results.get(n);
    }
}