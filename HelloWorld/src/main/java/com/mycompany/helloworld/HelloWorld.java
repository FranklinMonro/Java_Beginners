/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.helloworld;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Franco
 */
public class HelloWorld {

    public static void main(String[] args) {
        int age = 30;
        age = 35;
        int myAge = 30;
        int herAge = myAge;
        byte ageByte = 30;
        int viewsCount = 1234567890;
        int viewsCountUnderscore = 1_234_567; // Use underscore to make numbers more readable
        long numberLong = 22_44_66_7778_99L; // Use suffix L(Long) when number is to large for interger
        float price = 10.99F; // Use suffix F(float) when it is a float
        char letter  = 'A'; // Use single quotes for single charachters
        String multipleLetters = "AB"; // Use double quotes for multiple charachters
        boolean isEligible = false;
        Date now = new Date();
                
        System.out.println("Hello World!");
        System.out.println("age: " + age);
        System.out.println("herAge: " + herAge);
        System.out.println("ageByte: " + ageByte);
        System.out.println("viewsCount: " + viewsCount);
        System.out.println("viewsCountUnderscore: " + viewsCountUnderscore);
        System.out.println("numberLong: " + numberLong);
        System.out.println("price: " + price);
        System.out.println("letter: " + letter);
        System.out.println("letter: " + letter);
        System.out.println("multipleLetters: " + multipleLetters);
        System.out.println("isEligible: " + isEligible);
        System.out.println("now: " + now);
        System.out.println("now.getTime: " + now.getTime()); // Shortcut sout
        
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 3;
        System.out.println("point1: " + point1);
        System.out.println("point2: " + point2);
        
        String message = "Hello World" + "!!";
        System.out.println("message: " + message);
        System.out.println("message end with '!!': " + message.endsWith("!!"));
        System.out.println("message start with '!!': " + message.startsWith("!!"));
        System.out.println("message length is: " + message.length());
        System.out.println("index of 'W' in message: " + message.indexOf('W'));
        System.out.println("replace '!' with '*' in message: " + message.replace("!", "*"));
        System.out.println("message in lower case: " + message.toLowerCase());
        System.out.println("message in upper case: " + message.toUpperCase());
        System.out.println("message trim: " + message.trim());
        
        String msg = "Hello \"Mosh\"";
        String directory = "c:\\Windows\\..";
        String breakLine = "message 1 \n message on new line";
        String msgTab = "message \t message tab";
        System.out.println("msg: " + msg);
        System.out.println("directory: " + directory);
        System.out.println("breakLine: " + breakLine);
        System.out.println("msgTab: " + msgTab);
        
        int[] numberArray0 = new int[5]; // In the new we specify the length of the array
        numberArray0[0] = 1;
        numberArray0[1] = 2;
        int[] numberArray1 = {2, 5, 1, 4, 3};
        System.out.println("numberArray0: " + numberArray0);
        System.out.println("numberArray0 to string: " + Arrays.toString(numberArray0));
        System.out.println("numberArray1 length: " + numberArray1.length);
        System.out.println("numberArray1 to string: " + Arrays.toString(numberArray1));
        Arrays.sort(numberArray1);
        System.out.println("numberArray1 sorted: " + Arrays.toString(numberArray1));
        
        int[][] multiDimArray0 = new int[2][3];
        multiDimArray0[0][0] = 1;
        int[][][] multiDimArray1 = new int[2][3][5];
        int[][] multiDimArray2 = {{0, 1, 2}, {3, 4, 5}};
        System.out.println("multiDimArray0 to string: " + Arrays.toString(multiDimArray0));
        System.out.println("multiDimArray0 to deep string" + Arrays.deepToString(multiDimArray0));
        System.out.println("multiDimArray1 to deep string" + Arrays.deepToString(multiDimArray1));
        System.out.println("multiDimArray2 to deep string" + Arrays.deepToString(multiDimArray2));
        
        final float THE_PI = 3.14F; // Cannot assign a new number when variable is final - final is constant
        System.out.println("THE_PI: " + THE_PI);
        
        int plusResult = 10 + 3;
        int minusResult = 10 - 3;
        int timesResult = 10 * 3;
        double devideResult = (double)10 / (double)3;
        System.out.println("plusResult: " + plusResult);
        System.out.println("minusResult: " + minusResult);
        System.out.println("timesResult: " + timesResult);
        System.out.println("devideResult: " + devideResult);
        
        int incrementNumber = 1;
        incrementNumber++;
        int decrementNumber = 5;
        decrementNumber--;
        System.out.println("increment++: "  + incrementNumber);
        System.out.println("decrementNumber--: " + decrementNumber);
    }
}
