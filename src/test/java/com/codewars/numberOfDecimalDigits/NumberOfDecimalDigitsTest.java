package com.codewars.numberOfDecimalDigits;

import com.codewars.numberOfDecimalDigits.NumberOfDecimalDigits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDecimalDigitsTest {
    @Test
    public void Digits() {
        assertEquals(1,  NumberOfDecimalDigits.Digits(5l));
        assertEquals(5,  NumberOfDecimalDigits.Digits(12345l));
        assertEquals(10, NumberOfDecimalDigits.Digits(9876543210l));
    }
}