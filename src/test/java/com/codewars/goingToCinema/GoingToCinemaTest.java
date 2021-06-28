package com.codewars.goingToCinema;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoingToCinemaTest {
    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: movie");
        testing(GoingToCinema.movie(500, 15, 0.9), 43);
        testing(GoingToCinema.movie(100, 10, 0.95), 24);
    }
}