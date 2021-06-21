package com.codewars.willYouMakeIt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroFuelTest {
    @Test
    public void testSomething() {
        assertTrue(ZeroFuel.zeroFuel(50, 25, 2));
        assertFalse(ZeroFuel.zeroFuel(100, 50, 1));
    }
}