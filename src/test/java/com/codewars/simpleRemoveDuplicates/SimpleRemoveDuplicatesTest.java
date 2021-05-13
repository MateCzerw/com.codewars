package com.codewars.simpleRemoveDuplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleRemoveDuplicatesTest {
    @Test
    public void basicTests1(){
        assertArrayEquals(new int[]{4,6,3},SimpleRemoveDuplicates.solve(new int[]{3,4,4,3,6,3}));
    }    @Test
    public void basicTests2(){
        assertArrayEquals(new int[]{1,2,3},SimpleRemoveDuplicates.solve(new int[]{1,2,1,2,1,2,3}));
    }    @Test
    public void basicTests3(){
        assertArrayEquals(new int[]{1,2,3,4},SimpleRemoveDuplicates.solve(new int[]{1,2,3,4}));
    }    @Test
    public void basicTests4(){
        assertArrayEquals(new int[]{4,5,2,1},SimpleRemoveDuplicates.solve(new int[]{1,1,4,5,1,2,1}));
    }
}