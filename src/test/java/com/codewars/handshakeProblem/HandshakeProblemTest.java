package com.codewars.handshakeProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandshakeProblemTest {
    @Test
    public void SampleTest1()
    {
        assertEquals(1, HandshakeProblem.GetParticipants(0));
    }
    @Test
    public void SampleTest2()
    {
        assertEquals(2, HandshakeProblem.GetParticipants(1));
    }
    @Test
    public void SampleTest3()
    {
        assertEquals(3, HandshakeProblem.GetParticipants(3));
    }
    @Test
    public void SampleTest4()
    {
        assertEquals(4, HandshakeProblem.GetParticipants(6));
    }
    @Test
    public void SampleTest5()
    {
        assertEquals(5, HandshakeProblem.GetParticipants(7));
    }
}