package com.kenny.wenny;

public class Refactor {
    public static void refactorExample() {
        /*
        Original code:
        int num1 = 10;
        int num2 = 5;
        String operation = "+";
        int result;
        if (operation.equals("+")) {
            result = num1 + num2;
        } else if (operation.equals("-")) {
            result = num1 - num2;
        } else {
            System.out.println("Invalid operation!");
            return;
        }
        System.out.println("Result: " + result);
         */
        int num1 = 10;
        int num2 = 5;
        String operation = "+";
        int result = performOperation(num1, num2, operation);
        System.out.println("Result: " + result);
    }

    public static int performOperation(int first, int second, String operation) {
        if (operation.equals("+")) {
            return first + second;
        } else if (operation.equals("-")) {
            return first - second;
        } else {
            throw new RuntimeException("Invalid operation!");
        }
    }
}
