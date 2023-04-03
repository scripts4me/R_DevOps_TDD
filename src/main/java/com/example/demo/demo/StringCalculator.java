package com.example.demo.demo;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == "") {
            return 0;
        } else {
            String[] submittedNumbers = numbers.split(",");
            int finalResult = calculateSum(submittedNumbers);
            return finalResult;
        }
    }

    private int calculateSum(String[] inputSplittedByDelimiter) {
        int result = 0;
        for (String token : inputSplittedByDelimiter) {
            result += addSingleToken(token);
        }
        return result;
    }

    private int addSingleToken(String token) {
        Integer valueAsInteger = Integer.parseInt(token);
        return valueAsInteger;
    }

}
