package com.codewars.smallestValueOfArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestValueOfArrayTest {
    @Test
    public void testSample() {
        assertEquals(  0 , SmallestValueOfArray.findSmallest( new int [] {1, 2, 3} , "index") );
        assertEquals( 2 , SmallestValueOfArray.findSmallest( new int [] {7, 12, 3, 2, 27} , "value") );
        assertEquals(  3 , SmallestValueOfArray.findSmallest( new int [] {7, 12, 3, 2, 27} , "index") );
    }
}