package com.codewars.completeThePattern2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompleteThePattern2Test {
    @Test
    public void Test_For_1() {
        assertEquals("1",CompleteThePattern2.pattern(1));
    }
    @Test
    public void Test_For_5() {
        assertEquals("54321\n5432\n543\n54\n5",CompleteThePattern2.pattern(5));
    }
    @Test
    public void Test_For_10() {
        assertEquals("10987654321\n1098765432\n109876543\n10987654\n1098765\n109876\n10987\n1098\n109\n10",CompleteThePattern2.pattern(10));
    }
    @Test
    public void Test_For_0() {
        assertEquals("",CompleteThePattern2.pattern(0));
    }
    @Test
    public void Test_For_Minus5() {
        assertEquals("",CompleteThePattern2.pattern(-5));
    }
}