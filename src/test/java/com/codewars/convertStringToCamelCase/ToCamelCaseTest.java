package com.codewars.convertStringToCamelCase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToCamelCaseTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_stealth_warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ToCamelCase.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
        String input = "The-stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("TheStealthWarrior", ToCamelCase.toCamelCase(input));
    }
}