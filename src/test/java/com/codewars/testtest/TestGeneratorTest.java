package com.codewars.testtest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestGeneratorTest {
    @Test
    void shouldReturnListOfEmployees(){
        String employees = "Adam Kruk; Adam Kruk; Adam Kruk-CPCA; Adam Michał Kruk; Zbigniew Stonoga; Agnieszka Patrycja Stonoga-Lebioda";
        assertEquals(6, TestGenerator.solution(employees, "Pepco"));
    }
}