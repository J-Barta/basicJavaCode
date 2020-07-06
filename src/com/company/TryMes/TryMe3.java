package com.company.TryMes;

import java.util.Scanner;

public class TryMe3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        double number = input.nextDouble();

        if(number >= 0) {
            System.out.println("Your number is positive.");

        } else {
            System.out.println("Your number is negative.");
        }
    }
}