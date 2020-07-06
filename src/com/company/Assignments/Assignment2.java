package com.company.Assignments;

import java.util.Scanner;

public class Assignment2 {

    public static double fahrenheit, celsius;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //1. Ask for Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        //2. Convert to Celsius
        celsius = (fahrenheit-32) * (5.0/9);
        //3. Display Conversion
        System.out.println("In celsius, " + fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius");

    }

}


