package com.codewars.suitcasePacking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitcasePackingTest {
    @Test
    public void fixed_test() {
        assertEquals(true, SuitcasePacking.fit_in(1,2,3,2));
        assertEquals(false, SuitcasePacking.fit_in(1,2,2,1));
        assertEquals(false, SuitcasePacking.fit_in(3,2,3,2));
        assertEquals(false, SuitcasePacking.fit_in(1,2,1,2));
        assertEquals(false, SuitcasePacking.fit_in(6,5,8,7));
    }
}