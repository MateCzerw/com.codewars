package com.codewars.sumDifferencesBetweenProductsandLCMs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void BasicTests1()
    {
        assertEquals( 840, Solution.sumDifferencesBetweenProductsAndLCMs(new int[][]{{15,18}, {4,5}, {12,60}}));
    }

    @Test
    public void BasicTests2()
    {

        assertEquals(1092, Solution.sumDifferencesBetweenProductsAndLCMs(new int[][]{{1,1}, {0,0}, {13,91}}));

    }

    @Test
    public void BasicTests3()
    {

        assertEquals(   0, Solution.sumDifferencesBetweenProductsAndLCMs(new int[][]{{15,7}, {4,5}, {19,60}}));

    }
    @Test
    public void BasicTests4()
    {

        assertEquals(1890, Solution.sumDifferencesBetweenProductsAndLCMs(new int[][]{{20,50}, {10,10}, {50,20}}));

    }
    @Test
    public void BasicTests5()
    {

        assertEquals(   0, Solution.sumDifferencesBetweenProductsAndLCMs(new int[][]{}));
    }
}