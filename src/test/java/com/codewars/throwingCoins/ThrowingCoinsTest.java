package com.codewars.throwingCoins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThrowingCoinsTest {
    @Test
    public void BasicTests1() throws Exception {
        ThrowingCoins c = new ThrowingCoins();

        assertEquals(new Object[] {"H","T"}, (Object[])c.coin(1));

    }
    @Test
    public void BasicTests2() throws Exception {
        ThrowingCoins c = new ThrowingCoins();

        assertEquals(new Object[] {"HH","HT","TH","TT"}, (Object[])c.coin(2));

    }
    @Test
    public void BasicTests3() throws Exception {
        ThrowingCoins c = new ThrowingCoins();


        assertEquals(new Object[] {"HHH","HHT","HTH","HTT","THH","THT","TTH","TTT"}, (Object[])c.coin(3));
    }
}