package com.codewars.sortArrays1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortArraysTest {
    @Test
    public void intArrayTests() {
        Integer[] ai={1,2,3};
        Integer[] uai={2,3,1};
        assertEquals(ai[0], SortArrays.sortArray(uai)[0]);
        assertEquals(ai[1], SortArrays.sortArray(uai)[1]);
        assertEquals(ai[2], SortArrays.sortArray(uai)[2]);
    }
}