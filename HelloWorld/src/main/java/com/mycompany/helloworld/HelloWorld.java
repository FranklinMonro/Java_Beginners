/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.helloworld;

import java.awt.*;
import java.text.NumberFormat;
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
        int incrementNumberA = 1;
        int incrementNumberB = incrementNumberA++;
        int incrementNumberC = ++incrementNumberA;
        System.out.println("increment++: "  + incrementNumber);
        System.out.println("decrementNumber--: " + decrementNumber);
        System.out.println("incrementNumberA: " + incrementNumberA);
        System.out.println("incrementNumberB: " + incrementNumberB);
        System.out.println("incrementNumberC: " + incrementNumberC);
        
        int augmentedA = 1;
        augmentedA += 2;
        int augmentedB = 7;
        augmentedB -= 2;
        int augmentedC = 5;
        augmentedC *= 2;
        int augmentedD = 16;
        augmentedD /= 2;
        System.out.println("augmentedA: " + augmentedA);
        System.out.println("augmentedB: " + augmentedB);
        System.out.println("augmentedC: " + augmentedC);
        System.out.println("augmentedD: " + augmentedD);
        
        // Implicit casting
        // byte -> short -> int -> long -> float -> double
        short castA = 1;
        int castB = castA + 2;
        System.out.println("castA: " + castA);
        System.out.println("castB: " + castB);
        
        // Explicit casting
        double castC = 1.7;
        int castD = (int)castC + 2;
        String castE = "1";
        int castF = Integer.parseInt(castE) + 3;
        System.out.println("castD: " + castD);
        System.out.println("castF: " + castF);
        
        int mathA = Math.round(1.1F);
        double mathB = Math.ceil(1.1F);
        int mathC = (int)Math.floor(1.1F);
        int mathD = Math.max(1, 2);
        double mathE = Math.random();
        double mathF = Math.random() * 100;
        double mathG = Math.round(mathF);
        int mathH = (int)mathG;
        int mathI = (int)(Math.random() * 100);
        System.out.println("mathA, round: " + mathA);
        System.out.println("mathB, ceiling: " + mathB);
        System.out.println("mathC, floor: " + mathC);
        System.out.println("mathD, max: " + mathD);
        System.out.println("mathE, random: " + mathE);
        System.out.println("mathF, random * 100: " + mathF);
        System.out.println("mathG, round -> random * 100: " + mathG);
        System.out.println("mathH, int casting -> round -> random * 100: " + mathH);
        System.out.println("mathI, int casting -> random * 100: " + mathI);
        
        NumberFormat currencyA = NumberFormat.getCurrencyInstance();
        String currencyFormatA = currencyA.format(10234.891);
        NumberFormat percentageA = NumberFormat.getPercentInstance();
        String percentageFormatA = percentageA.format(87.1);
        String methodChainingA = NumberFormat.getCurrencyInstance().format(25.10);
        System.out.println("currencyA: " + currencyA);
        System.out.println("currencyFormatA: " + currencyFormatA);
        System.out.println("percentageA: " + percentageA);
        System.out.println("percentageFormatA: " + percentageFormatA);
        System.out.println("methodChainingA: " + methodChainingA);
    }
}
