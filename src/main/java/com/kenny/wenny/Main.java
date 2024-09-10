package com.kenny.wenny;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // arrayPractice();
        hashMapPractice();
    }

    public static void arrayPractice() {
        /*
         * An array of Strings
         * And an nth element of this (just pick any index)
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