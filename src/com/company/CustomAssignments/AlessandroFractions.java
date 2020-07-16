package com.company.CustomAssignments;

import java.util.Scanner;

import static java.lang.Math.*;

public class AlessandroFractions {

    public static int numerator, denominator, divisor, smaller, simpNum, simpDen;
    public static boolean changed;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a numerator");
        numerator = input.nextInt();

        System.out.println("Please enter a denominator");
        denominator = input.nextInt();

        divisor = 2;

        smaller = min(numerator, denominator);
        changed = false;

        while(divisor <= smaller) {
            if(numerator % divisor == 0 && denominator % divisor == 0) {
                simpNum = numerator/divisor;
                simpDen = denominator/divisor;
                changed = true;
            }
            divisor++;
        }

        if(!changed) {
            System.out.println(numerator + "/" + denominator + " is already simplified.");
        } else {
            System.out.println("Simplified, " + numerator + "/" + denominator + " is " + simpNum + "/" + simpDen + ".");
        }
    }
}