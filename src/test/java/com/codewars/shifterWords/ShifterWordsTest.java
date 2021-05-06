package com.codewars.shifterWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShifterWordsTest {
    @Test
    public void on(){
        assertEquals(1, ShifterWords.count("ON"));
    }
    @Test
    public void osIsUpdated(){
        assertEquals(2, ShifterWords.count("OS IS UPDATED"));
    }
    @Test
    public void whoIsWho(){
        assertEquals(2, ShifterWords.count("WHO IS WHO"));
    }
    @Test
    public void js(){
        assertEquals(0, ShifterWords.count("JS"));
    }
    @Test
    public void iIiiIIii(){
        assertEquals(2, ShifterWords.count("I III I III"));
    }
    @Test
    public void empty(){
        assertEquals(0, ShifterWords.count(""));
    }

}