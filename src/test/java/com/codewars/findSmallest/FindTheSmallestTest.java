package com.codewars.findSmallest;

import com.codewars.findSmallest.FindTheSmallest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindTheSmallestTest {
    private static void testing(long n, String res) {
        assertEquals(res,
                Arrays.toString(FindTheSmallest.smallest(n)));
    }
    @Test
    public void test1() {
        testing(261235, "[126235, 2, 0]");
    }
    @Test
    public void test2() {
        testing(209917, "[29917, 0, 1]");
    }
    @Test
    public void test3() {
        testing(285365, "[238565, 3, 1]");
    }
    @Test
    public void test4() {
        testing(269045, "[26945, 3, 0]");
    }
    @Test
    public void test5() {
        testing(296837, "[239687, 4, 1]");
    }

}