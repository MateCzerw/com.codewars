package com.codewars.vowelCount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals(5, Vowels.getCount("abracadabra"));
    }
}