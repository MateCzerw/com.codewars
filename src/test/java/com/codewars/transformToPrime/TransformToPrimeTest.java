package com.codewars.transformToPrime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformToPrimeTest {
    @Test
    public void checkSmallArraySize1()
    {
        assertEquals(1, TransformToPrime.minimumNumber(new int[]{3,1,2}));

    }
    @Test
    public void checkSmallArraySize2()
    {

        assertEquals(0, TransformToPrime.minimumNumber(new int[]{5,2}));

    }
    @Test
    public void checkSmallArraySize3()
    {

        assertEquals(0, TransformToPrime.minimumNumber(new int[]{1,1,1}));
    }
    @Test
    public void checkLargerArraySize1()
    {
        assertEquals(5, TransformToPrime.minimumNumber(new int[]{2,12,8,4,6}));

    }
    @Test
    public void checkLargerArraySize2()
    {

        assertEquals(2, TransformToPrime.minimumNumber(new int[]{50,39,49,6,17,28}));
    }

}