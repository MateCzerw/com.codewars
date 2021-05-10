package com.codewars.invisibleCubes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class InvisibleCubesTest {
    @Test
    public void fixedTest() {
        InvisibleCubes kata = new InvisibleCubes();
        assertEquals(Long.valueOf(0L), kata.notVisibleCubes(0L));
        assertEquals(Long.valueOf(0L), kata.notVisibleCubes(1L));
        assertEquals(Long.valueOf(0L), kata.notVisibleCubes(2L));
        assertEquals(Long.valueOf(1L), kata.notVisibleCubes(3L));
        assertEquals(Long.valueOf(27L), kata.notVisibleCubes(5L));
    }
}