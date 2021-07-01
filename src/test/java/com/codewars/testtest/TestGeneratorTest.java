package com.codewars.testtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestGeneratorTest {
    @Test
    void shouldReturnListOfEmployees(){
        String employees = "Adam Kowalski; Adam Kowalski; Adam Kowalski-Lewandowski; Adam Michał Kowalski; Zbigniew Stonoga; Agnieszka Patrycja Stonoga-Lebioda";
        assertEquals("", TestGenerator.solution(employees, "Pepco"));
    }
}