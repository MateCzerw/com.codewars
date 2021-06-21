package com.codewars.strangeMathematics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrangeMathematicsTest {
    @Test
    public void sampleTestCases(){
        assertEquals(4, StrangeMathematics.mathematics(11, 2));
        assertEquals( 11, StrangeMathematics.mathematics(15, 5));
        assertEquals(7, StrangeMathematics.mathematics(15, 15));
    }

    @Test
    public void sampleTestCases1(){
        assertEquals(4, StrangeMathematics.mathematics(11, 2));
    }
}