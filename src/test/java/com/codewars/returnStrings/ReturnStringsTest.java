package com.codewars.returnStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnStringsTest {
    @Test
    public void testSomething() {
        assertEquals("Hello, Ryan how are you doing today?", ReturnStrings.greet("Ryan"));
    }
}