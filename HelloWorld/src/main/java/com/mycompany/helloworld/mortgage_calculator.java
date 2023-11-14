/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class mortgage_calculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;    
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        
        System.out.print("Annual Interest Rate: ");
        float annualIntrestRate = scanner.nextFloat();
        float monthlyIntrest = annualIntrestRate / PERCENT / MONTHS_IN_YEAR;
                
        System.out.print("Period (Years):: ");
        double period = scanner.nextDouble();
    }
    
}
