package com.codewars.incredibleSumOfRationals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncredibleSumOfRationalsTest {
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests sumFracts");
        int[][] a = new int[][] { {1,2}, {2,9}, {3,18}, {4,24}, {6,48} };
        String r = "[85, 72]";
        testing(IncredibleSumOfRationals.sumFracts(a), r);
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests sumFracts");
        int[][] a;
        String r;
        a = new int[][] { {1, 2}, {1, 3}, {1, 4} };
        r = "[13, 12]";
        testing(IncredibleSumOfRationals.sumFracts(a), r);
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests sumFracts");
        int[][] a;
        String r;
        a = new int[][] { {1, 3}, {5, 3} };
        r = "2";
        testing(IncredibleSumOfRationals.sumFracts(a), r);
    }    @Test
    public void test4() {
        System.out.println("Fixed Tests sumFracts");
        int[][] a;
        String r;
        a = new int[][] {};
        r = null;
        testing(IncredibleSumOfRationals.sumFracts(a), r);
    }
}