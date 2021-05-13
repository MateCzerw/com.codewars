package com.codewars.sumOfParts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfPartsTest {
    private static void dotest(int[] ls, int[] expect) {
        int[] actual = SumOfParts.sumParts(ls);
        assertArrayEquals(expect, actual);
    }
    @Test
    public void test1() {
        dotest(new int[] {}, new int[] {0});

    }

    @Test
    public void test2() {

        dotest(new int[] {0, 1, 3, 6, 10}, new int[] {20, 20, 19, 16, 10, 0});


    }

    @Test
    public void test3() {

        dotest(new int[] {1, 2, 3, 4, 5, 6}, new int[] {21, 20, 18, 15, 11, 6, 0});


    }

    @Test
    public void test4() {

        dotest(new int[] {744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358},
                new int[] {10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0});

    }
}