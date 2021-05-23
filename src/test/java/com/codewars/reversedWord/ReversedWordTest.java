package com.codewars.reversedWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedWordTest {
    @Test
    public void testSomething() {
        assertEquals("eating like I", ReversedWord.reverseWords("I like eating"));
        assertEquals("flying like I", ReversedWord.reverseWords("I like flying"));
        assertEquals("nice is world The", ReversedWord.reverseWords("The world is nice"));
    }
}