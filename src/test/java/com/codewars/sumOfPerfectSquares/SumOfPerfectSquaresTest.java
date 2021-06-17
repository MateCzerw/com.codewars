package com.codewars.sumOfPerfectSquares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfPerfectSquaresTest {
    @Test
    public void easyTests1() {
        assertEquals(4, SumOfPerfectSquares.nSquaresFor(15));
    }
    @Test
    public void easyTests2() {
        assertEquals(1, SumOfPerfectSquares.nSquaresFor(16));
    }
    @Test
    public void easyTests3() {
        assertEquals(2, SumOfPerfectSquares.nSquaresFor(17));
    }
    @Test
    public void easyTests4() {
        assertEquals(2, SumOfPerfectSquares.nSquaresFor(18));
    }
    @Test
    public void easyTests5() {
        assertEquals(3, SumOfPerfectSquares.nSquaresFor(19));
    }
}
