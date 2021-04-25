package com.codewars.backspacesInString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackspacesInStringTest {

    @Test
    public void testCleanString() {
        final BackspacesInString bis = new BackspacesInString();
        assertEquals("ac", bis.cleanString("abc#d##c"));
        assertEquals("", bis.cleanString("abc####d##c#"));
    }

}