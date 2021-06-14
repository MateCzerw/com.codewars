package com.codewars.powerOfI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfITest {
    @Test
    public void testSomething() {
        assertEquals("1",PowerOfI.pofi(0));
        assertEquals("i",PowerOfI.pofi(1));
        assertEquals("-1",PowerOfI.pofi(2));
        assertEquals("-i",PowerOfI.pofi(3));
        assertEquals("1",PowerOfI.pofi(4));
        assertEquals("i",PowerOfI.pofi(5));
        assertEquals("-1",PowerOfI.pofi(6));
        assertEquals("-i",PowerOfI.pofi(7));
        assertEquals("1",PowerOfI.pofi(8));
        assertEquals("i",PowerOfI.pofi(9));
        assertEquals("-1",PowerOfI.pofi(10));
    }

}