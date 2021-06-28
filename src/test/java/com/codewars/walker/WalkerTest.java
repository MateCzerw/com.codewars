package com.codewars.walker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WalkerTest {
    private static void dotest(int a, int b, int c, int alpha, int beta, int gamma, String expect) {
        String actual = Arrays.toString(Walker.solve(a, b, c, alpha, beta, gamma));
        assertEquals(expect, actual);
    }
    @Test
    public void test1() {
        dotest(12, 20, 18, 45, 30, 60, "[15, 135, 49, 18]");

    }
    @Test
    public void test2() {
        dotest(15,15,19,50,29,55, "[12, 133, 18, 44]");

    }
    @Test
    public void test3() {
        dotest(14,25,17,41,35,59, "[20, 129, 41, 57]");
    }
}