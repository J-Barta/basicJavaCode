package com.company.Assignments;

import java.util.Scanner;
import static java.lang.Math.*;

public class Assignment3 {

    public static void main (String [ ] args) {

        // Declare variables
        double radius;
        boolean correct = false;
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the radius
        System.out.print("Please enter radius: ");

        //Read the radius
        radius = input.nextDouble();
        while(!correct) {
            if(radius > 0) {
                //Calculate and display area
                System.out.println("The area for the circle of radius " + radius + " is " + PI * pow(radius, 2));
                correct = true;
            } else {
                System.out.print("Please enter a circle with a positive radius: ");
                radius = input.nextDouble();
            }
        }
    }
}

