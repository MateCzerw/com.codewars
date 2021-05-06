package com.codewars.formTheLargest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormTheLargestTest {

    @Test
    public void passBasicTests() {
        assertEquals(  321, FormTheLargest.maxNumber(213));
        assertEquals( 9873, FormTheLargest.maxNumber( 7389));
        assertEquals(97632, FormTheLargest.maxNumber(63792));
    }
    @Test
    public void passDigitOccurrenceRepeation() {
        assertEquals(  977665, FormTheLargest.maxNumber(  566797));
        assertEquals( 9987332, FormTheLargest.maxNumber( 2399783));
        assertEquals(99997777, FormTheLargest.maxNumber(79797979));
    }
    @Test
    public void passLargeNumbers() {
        assertEquals( 98764321, FormTheLargest.maxNumber( 17693284));
        assertEquals( 98776531, FormTheLargest.maxNumber( 17758936));
        assertEquals(987665431, FormTheLargest.maxNumber(134976658));
    }
}