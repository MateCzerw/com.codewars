package com.codewars.shorterConcat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShorterConcatTest {
    @Test
    public void static1() {
        assertEquals("abcdetsrifabcde",ShorterConcat.shorterReverseLonger("first", "abcde"));
        assertEquals("bauollehbau",ShorterConcat.shorterReverseLonger("hello", "bau"));
        assertEquals("fghiedcbafghi",ShorterConcat.shorterReverseLonger("abcde", "fghi"));
    }
}