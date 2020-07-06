package com.company.Other;

import java.util.Scanner;

import static java.lang.Math.*;

public class NumberSwap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number to test whether it is prime or not: ");

        int x = input.nextInt();
        int i = 1;

        boolean prime = true;

        while(i <= sqrt(x)) {
           double divided = x/i;
           double rounded = round(divided);
           if(rounded == divided) {
               prime = false;
           }
           i++;
        }

        if(prime) {
            System.out.println("It is!");
        } else {
            System.out.println("It's not.");
        }

    }
}
