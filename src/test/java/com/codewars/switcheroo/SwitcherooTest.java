package com.codewars.switcheroo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitcherooTest {
    @Test
    public void test1() {
        assertEquals("abc",Switcheroo.switcheroo( "bac"));
    }
    @Test
    public void test2() {
        assertEquals("ccc",Switcheroo.switcheroo("ccc"));
    }
    @Test
    public void test3() {
        assertEquals("aaabcccbaaa",Switcheroo.switcheroo("bbbacccabbb"));
    }
}