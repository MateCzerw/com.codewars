package com.codewars.gcd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {
    @Test
    public void testGcd() {
        assertEquals(6, GCD.compute(30,12));
        assertEquals(1, GCD.compute(8,9));
        assertEquals(1, GCD.compute(1,1));
    }
}