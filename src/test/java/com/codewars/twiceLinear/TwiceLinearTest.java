package com.codewars.twiceLinear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwiceLinearTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests dblLinear");
        testing(TwiceLinear.dblLinear(10), 22);
        testing(TwiceLinear.dblLinear(20), 57);
        testing(TwiceLinear.dblLinear(30), 91);
        testing(TwiceLinear.dblLinear(50), 175);

    }
}