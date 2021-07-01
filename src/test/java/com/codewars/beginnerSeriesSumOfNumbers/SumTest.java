package com.codewars.beginnerSeriesSumOfNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    Sum s = new Sum();

    @Test
    public void Test1()
    {
        assertEquals(-1, s.GetSum(0, -1));
    }
    @Test
    public void Test2()
    {
        assertEquals(1, s.GetSum(0, 1));
    }
    @Test
    public void Test3()
    {
        assertEquals(1, s.GetSum(-1, 0));
    }
}