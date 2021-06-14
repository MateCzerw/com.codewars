package com.codewars.playingWithPassphrasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingWithPassphrassesTest {
    @Test
    public void test1() {
        assertEquals("!!!vPz fWpM J", PlayingWithPassphrasses.playPass("I LOVE YOU!!!", 1));
    }

    @Test
    public void test4() {
        assertEquals("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO",
                PlayingWithPassphrasses.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
    }

}