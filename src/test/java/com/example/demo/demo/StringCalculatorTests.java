package com.example.demo.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTests {

    @Test
    public void OneInteger1() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(5, calculator.add("5"));

    }
    
    @Test
    public void OneInteger2() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(7, calculator.add("7"));

    }
    
}
