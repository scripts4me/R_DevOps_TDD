package com.example.demo.demo;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers == "") {
            return 0;
        } else {

            String numbersWithoutSpace = numbers.replaceAll(" ", "");

            String[] submittedNumbers = numbersWithoutSpace.split(",");
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

        if (valueAsInteger > 1000) {
            valueAsInteger = 0;
        }

        if (valueAsInteger < -1000) {
            valueAsInteger = 0;
        }

        return valueAsInteger;

    }

}
