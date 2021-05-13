package com.codewars.handshakeProblem;

public class HandshakeProblem {
    public static int GetParticipants(int handshakes)
    {
        int delta = 1  + 8 * handshakes;
        return (int) Math.ceil(Math.max(((1d - Math.sqrt(delta)) / 2), ((1d + Math.sqrt(delta)) / 2)));
    }
}
