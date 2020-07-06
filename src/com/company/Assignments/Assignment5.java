package com.company.Assignments;

import java.util.Scanner;

import static java.lang.Math.*;

public class Assignment5 {

    public static boolean go = true;
    public static int choice;
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        while (go) {

            System.out.println("Enter 1 to convert Fahrenheit to Celsius");
            System.out.println("Enter 2 to convert Celsius to Fahrenheit");
            System.out.println("Enter 3 to average three numbers");
            System.out.println("Enter 4 to calculate the area of a circle");
            System.out.println("Enter another integer to exit");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    FToC();
                    break;
                case 2:
                    CToF();
                    break;
                case 3:
                    average();
                    break;
                case 4:
                    circleArea();
                    break;
                default:
                    go = false;
                    System.out.println("You chose to leave the program!");
            }
        }
    }

    public static void FToC() {
        //1. Ask for Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        //2. Convert to Celsius
        double celsius = (fahrenheit-32) * (5.0/9);
        //3. Display Conversion
        System.out.println("In celsius, " + fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius");
    }

    public static void CToF() {
        //1. Ask for Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();
        //2. Convert to Celsius
        double fahrenheit = celsius * 9.0/5 + 32;
        //3. Display Conversion
        System.out.println("In fahrenheit, " + celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");

    }

    public static void average() {
        System.out.print("Enter number 1: ");
        double num1 = input.nextDouble();
        System.out.println();

        System.out.print("Enter number 2: ");
        double num2 = input.nextDouble();
        System.out.println();

        System.out.print("Enter number 3: ");
        double num3 = input.nextDouble();
        System.out.println();

        System.out.println("The average of your numbers is: " + (num1+num2+num3)/3.0);
    }

    public static void circleArea() {
        // Ask the user to enter the radius
        System.out.print("Please enter radius: ");
        boolean valid = false;

        //Read the radius
        double radius = input.nextDouble();
        while(!valid) {
            if(radius > 0) {
                //Calculate and display area
                System.out.println("The area for the circle of radius " + radius + " is " + PI * pow(radius, 2));
                valid = true;
            } else {
                System.out.print("Please enter a circle with a positive radius: ");
                radius = input.nextDouble();
            }
        }
    }
}
