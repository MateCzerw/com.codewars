package com.codewars.oppositesAttract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OppositesAttractTest {
    @Test
    public void testOddAndEven1() {
        assertEquals(true, OppositesAttract.isLove(1, 4));
    }

    @Test
    public void testEvenAndEven2() {
        assertEquals(false, OppositesAttract.isLove(2, 2));
    }

    @Test
    public void testOddAndOdd3() {
        assertEquals(false, OppositesAttract.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd4() {
        assertEquals(true, OppositesAttract.isLove(0, 1));
    }

    @Test
    public void testEvenAndOdd5() {
        assertEquals(true, OppositesAttract.isLove(397, 722));
    }
}