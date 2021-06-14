package com.codewars.directionsReduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectionsReductionTest {
    @Test
    public void testSimpleDirReduc1() {
        assertArrayEquals(new String[]{"WEST"},
                DirectionsReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
    }
    @Test
    public void testSimpleDirReduc2() {
        assertArrayEquals(new String[]{},
                DirectionsReduction.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));
    }
}