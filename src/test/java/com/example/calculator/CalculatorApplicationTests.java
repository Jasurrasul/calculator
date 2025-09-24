package com.example.calculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;


class CalculatorServiceTest {


    private CalculatorService calculator;


    @BeforeEach
    void setUp() {
        calculator = new CalculatorService();
    }


    @Test
    @DisplayName("add() ska summera två tal")
    void addTwoNumbers() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-2, 2));
    }


    @Test
    @DisplayName("subtract() ska subtrahera korrekt")
    void subtractTwoNumbers() {
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(-4, calculator.subtract(-2, 2));
    }


    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0, 0, 0",
            "1, 2, 3",
            "-5, 5, 0",
            "100, 250, 350"
    })
    void addParameterized(int a, int b, int expected) {
        assertEquals(expected, calculator.add(a, b));
    }


    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0, 0, 0",
            "5, 2, 3",
            "-5, -5, 0",
            "100, 250, -150"
    })
    void subtractParameterized(int a, int b, int expected) {
        assertEquals(expected, calculator.subtract(a, b));
    }
}
