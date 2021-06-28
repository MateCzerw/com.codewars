package com.codewars.detectPangram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectPangramTest {
    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        DetectPangram pc = new DetectPangram();
        assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        DetectPangram pc = new DetectPangram();
        assertEquals(false, pc.check(pangram2));
    }
}