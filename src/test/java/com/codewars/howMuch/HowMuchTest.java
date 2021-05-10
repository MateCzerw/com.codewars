package com.codewars.howMuch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HowMuchTest {
    @Test
    public void BasicTests1() {
        assertEquals("[[M: 37 B: 5 C: 4][M: 100 B: 14 C: 11]]",
                HowMuch.howmuch(1, 100));
    }

    @Test
    public void BasicTests2() {
        assertEquals("[]",
                HowMuch.howmuch(2950, 2950));
    }
    @Test
    public void BasicTests3() {
        assertEquals("[[M: 9991 B: 1427 C: 1110]]",
                HowMuch.howmuch(10000, 9950));
    }

}