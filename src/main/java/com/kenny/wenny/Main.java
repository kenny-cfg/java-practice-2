package com.kenny.wenny;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // arrayPractice();
//        hashMapPractice();
//        forLoopWithVariable();
//        forLoopWithCollection();
//        numbers20To30();
//        numbers10To0();
//        forLoopExercise2();
//        exercise3();
//        exercise4();
//        exercise4WithTernary();
        refactorExample();
    }

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
    }

    /*
    public: accessible from all other classes
    static: don't need an instance of the class to call it
    void: return type. Void means 'don't return anything'
    function name: has to be unique within the class (sort of)
    (): arguments list, in this case, it's empty
     */
    public static void exercise4WithTernary() {
        int[] myNums = {1, 2, 3, 4, 5};
        for (int num : myNums) {
            System.out.println(getEvenOddStringIndicator(num));
        }
    }
    /*
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
return; }
System.out.println("Result: " + result);
     */

    private static String getEvenOddStringIndicator(int num) {
        return num % 2 == 0 ? "even" : "odd";
    }

    public static void exercise4() {
        /*
        I have an array of numbers int myNums = {1,2,3,4,5};
        Iterate through the array
        If the number is even, print out “even number”!
        Otherwise, print out “not even…”
        */
        int[] myNums = {1, 2, 3, 4, 5};
        for (int num : myNums) {
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }

    public static void exercise3() {
        /*
            count = 0
            while count is less than 10, print out “hi”, and +1 to count every time
            Once finished, print out “fin!”
         */
        var count = 0;
        while (count < 10) {
            System.out.println("hi");
            count++;
        }
        System.out.println("fin!");
    }

    public static void forLoopExercise2() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i : numbers) {
            System.out.println(i * i);
        }
    }

    public static void numbers10To0() {
        for (var i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void numbers20To30() {
        for (var i = 20; i <= 30; i++) {
            System.out.println(i);
        }
    }

    public static void forLoopWithVariable() {
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void forLoopWithCollection() {
        var arrayOfStrings = new String[]{"Laila", "Moge"};
        for (var string : arrayOfStrings) {
            System.out.println(string);
        }
    }

    public static void arrayPractice() {
        /*
         * An array of Strings
         * And a nth element of this (just pick any index)
         */
        //var arrayOfStrings = new String[]{"hello", "mum", "smelly"};
        String[] arrayOfStrings = {"hello", "mum", "smelly"};

        System.out.println(arrayOfStrings[2]);
    }

    public static void hashMapPractice() {
        /*
        A Hashmap of animal types & their names
        E.g. dog = mary, cat = kate
         */
        Map<String, String> petMap = new HashMap<>();
        // var petMap = new HashMap<String, String>();
        petMap.put("dog", "mary");
        petMap.put("cat", "kate");

        System.out.println(petMap.get("dog"));
    }
}