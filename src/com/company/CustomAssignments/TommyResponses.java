package com.company.CustomAssignments;

import java.util.Scanner;

public class TommyResponses {
    public static String greeting;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello and welcome to this wonderous program. Please input a greeting.");

        greeting = input.nextLine();

        if(greeting.equalsIgnoreCase("hello")) {
            System.out.println("Hello!");
        } else if(greeting.equalsIgnoreCase("hi")) {
            System.out.println("Hi!");
        } else if(greeting.equalsIgnoreCase("sup")) {
            System.out.println("Grammar is good!");
        } else if(greeting.equalsIgnoreCase("helo")) {
            System.out.println("HELO FRIEND!");
        } else if(greeting.equalsIgnoreCase("cheeky gigle")) {
            System.out.println("gigle gigle!");
        } else {
            System.out.println(greeting + "... interesting greeting");
        }
    }
}
