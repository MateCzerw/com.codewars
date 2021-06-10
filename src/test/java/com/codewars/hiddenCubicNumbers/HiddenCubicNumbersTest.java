package com.codewars.hiddenCubicNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HiddenCubicNumbersTest {

    HiddenCubicNumbers c = new HiddenCubicNumbers();
    @Test
    public void test0() {
        String s = "0 9026315 -827&()";
        assertEquals("0 0 Lucky", c.isSumOfCubes(s));
    }
    @Test
    public void test1() {
        String s = "aqdf&0#1xyz!22[153(777.777";
        assertEquals("0 1 153 154 Lucky", c.isSumOfCubes(s));
    }
    @Test
    public void test2() {
        String s = "aqdf&0#1xyz!22[153(777.777";
        assertEquals("0 1 153 154 Lucky", c.isSumOfCubes(s));
    }

}