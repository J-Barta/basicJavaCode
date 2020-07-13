package com.company.CustomAssignments;

import java.util.Scanner;

public class ChristianMath {

    public static boolean valid = false;
    public static double num1, num2, result;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please choose between 'addition', 'subtraction', 'multiplication', and 'division'.");
        String choice = input.nextLine();

        System.out.println("Please enter a number.");
        num1 = input.nextDouble();


        System.out.println("Please enter a second number.");
        num2 = input.nextDouble();

        while(!valid) {
            valid = true;
            if(choice.equalsIgnoreCase("addition")) {
                result = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
            }else if(choice.equalsIgnoreCase("subtraction")) {
                result = num1 - num2;
                System.out.println("The difference between " + num1 + " and " + num2 + " is " + result);
            }else if(choice.equalsIgnoreCase("multiplication")) {
                result = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is " + result);
            }else if(choice.equalsIgnoreCase("division")) {
                result = num1 / num2;
                System.out.println(num1 + " divided by " + num2 + " is " + result);
            } else {
                System.out.println("Please choose between 'addition', 'subtraction', 'multiplication', and 'division'.");
                choice = input.nextLine();
                valid = false;
            }
        }
    }
}

