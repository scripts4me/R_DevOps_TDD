package com.example.demo.demo;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

public class StringCalculatorTests {

    @Test
    public void OneInteger() {
        StringCalculator calculator = new StringCalculator();
        Assert.assertEqual("5", calculator.add(5));
    }
    
}
