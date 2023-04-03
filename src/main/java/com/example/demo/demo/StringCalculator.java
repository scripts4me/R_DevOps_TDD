package com.example.demo.demo;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == "") {
            return 0;
        } else {
            return Integer.valueOf(numbers);
        }
    }

}
