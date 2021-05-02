package com.codewars.tankTruck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTruckTest {
    @Test
    public void test0() {
        assertEquals(2940, TankTruck.tankVol(5, 7, 3848));

    }

    @Test
    public void test1() {

        assertEquals(907, TankTruck.tankVol(2, 7, 3848));
    }
}