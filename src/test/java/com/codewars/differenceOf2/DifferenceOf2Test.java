package com.codewars.differenceOf2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceOf2Test {
    @Test
    public void sample_tests() {
        assertArrayEquals(
                new int[][]{{1, 3}, {2, 4}},
                DifferenceOf2.twosDifference(new int[]{1, 2, 3, 4})
        );

        assertArrayEquals(
                new int[][]{{1, 3}, {4, 6}},
                DifferenceOf2.twosDifference(new int[]{1, 3, 4, 6})
        );
    }
}