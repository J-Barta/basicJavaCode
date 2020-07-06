package com.company.Other;

import java.util.Scanner;

public class FibbonacciChecker {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Pick a number to check if it is a Fibonacci Number");
        int num = myObj.nextInt();
        int current = 1;
        int prev = 0;
        while (current < num) {
            int prevCache = prev;
            prev = current;
            current = current+prevCache;
        }
        if(current == num) {
            System.out.println("It is!");
        } else {
            System.out.println("It's not :(");
        }

    }
}
