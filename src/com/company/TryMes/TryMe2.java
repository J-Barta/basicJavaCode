package com.company.TryMes;

import java.util.Scanner;

public class TryMe2 {

    static double num1, num2, num3;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        num1 = input.nextDouble();
        System.out.println();

        System.out.print("Enter number 2: ");
        num2 = input.nextDouble();
        System.out.println();

        System.out.print("Enter number 3: ");
        num3 = input.nextDouble();
        System.out.println();

        System.out.println("The average of your numbers is: " + (num1+num2+num3)/3.0);

    }

}
