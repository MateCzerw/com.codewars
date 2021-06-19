package com.codewars.paper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperTest {
    @Test
    public void test1(){
        assertEquals(25, Paper.paperWork(5,5));
    }
}