package com.example.demo.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MathLibTests {

    @Test
    public void testEven1() {
        assertTrue(MathLib.isEven(2));
    }

    @Test
    public void testEven2() {
        assertTrue(MathLib.isEven(3));
    }
    
}
