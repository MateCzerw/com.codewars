package com.codewars.centerOfTheMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CenterOfTheMatrixTest {
    @Test
    public void fixedTestsNegative() {

        assertEquals(null, CenterOfTheMatrix.center(new int[0][0]));
        assertEquals(null, CenterOfTheMatrix.center(new int[][]{ {5,1}, {6,2}, {7,4}, {1,3} }));
        assertEquals(null, CenterOfTheMatrix.center(new int[][]{ {5,1}, {3,7}, {4,5} }));
        assertEquals(null, CenterOfTheMatrix.center(new int[][]{ {5,1,3}, {7,4,5} }));
        assertEquals(null, CenterOfTheMatrix.center(new int[3][0]));
    }

    @Test
    public void fixedTestsPositive1() {
        assertEquals(Integer.valueOf(3), CenterOfTheMatrix.center(new int[][]{ {3} }));
    }
    @Test
    public void fixedTestsPositive2() {
        assertEquals(Integer.valueOf(2), CenterOfTheMatrix.center(new int[][]{ {5,1,3}, {6,2,6}, {7,4,5} }));
    }
    @Test
    public void fixedTestsPositive3() {
        assertEquals(Integer.valueOf(4), CenterOfTheMatrix.center(new int[][]{ {5,1,3}, {6,2,6}, {7,4,5}, {10,12,12}, {14,0,0} }));
    }
    @Test
    public void fixedTestsPositive4() {
        assertEquals(Integer.valueOf(1), CenterOfTheMatrix.center(new int[][]{ {5,1,3} }));
    }
    @Test
    public void fixedTestsPositive5() {
        assertEquals(Integer.valueOf(1), CenterOfTheMatrix.center(new int[][]{ {5}, {1}, {3} }));
    }

}