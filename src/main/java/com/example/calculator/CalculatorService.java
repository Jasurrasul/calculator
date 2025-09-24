package com.example.calculator;


import org.springframework.stereotype.Service;


@Service
public class CalculatorService {


    /**
     * Summerar två heltal. Idempotent och deterministisk.
     */
    public int add(int a, int b) {
        return a + b;
    }


    /**
     * Subtraherar b från a.
     */
    public int subtract(int a, int b) {
        return a - b;
    }
}