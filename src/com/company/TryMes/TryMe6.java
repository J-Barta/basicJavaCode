package com.company.TryMes;

import java.util.Scanner;

import static java.lang.Math.*;

public class TryMe6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        double num1 = input.nextDouble();

        System.out.println("Please enter second number");
        double num2 = input.nextDouble();

        System.out.println(max(num1, num2) + " is larger than "+ min(num1, num2));

        if(num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        }else if(num2 < num1) {
            System.out.println(num2 + " is larger than "+ num1);
        }else {
            System.out.println(num1 + " is the same as "+ num2);
        }
    }
}