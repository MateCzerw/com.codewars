package com.codewars.mergedStringChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergedStringCheckerTest {
    @Test
    public void normalHappyFlow1() {
        assertTrue(MergedStringChecker.isMerge("codewars", "code", "wars"));
    }

    @Test
    public void normalHappyFlow2() {
        assertTrue(MergedStringChecker.isMerge("codewars", "cdwr", "oeas"));
    }

    @Test
    public void normalHappyFlow3() {
        assertFalse(MergedStringChecker.isMerge("codewars", "cod", "wars"));
    }

    @Test
    public void normalHappyFlow4() {
        assertTrue(MergedStringChecker.isMerge("mZJrxEoJ.M0;#qkqEXDZ[6+okN>-]4Ivz`%fRM5I[K qXx9Lz/(umZJrxEoJ.M0;#qkqEXDZ[6+okNVe,NevFPEZ3N:x(9>QZGzCXfsihK", "mZJrxEoJ.M0;#qkqEXDZ[6+okNVe,NevFPEZ3N:x", "mZJrxEoJ.M0;#qkqEXDZ[6+okN>-]4Ivz`%fRM5I[K qXx9Lz/(u(9>QZGzCXfsihK"));
    }

    @Test
    public void normalHappyFlow5() {
        assertTrue(MergedStringChecker.isMerge("p3Skcgs@^B9^@8veIekb_se8*g", "p3cs^B9vekg", "Skg@^@8eIb_se8*"));
    }

}