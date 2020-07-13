package com.company.TryMes;

import java.util.Scanner;

import static java.lang.Math.*;

public class TryMe6B {
    public static double x1, y1, x2, y2, distance;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first x-coordinate");
        x1 = input.nextDouble();
        System.out.println("Please enter the first y-coordinate");
        y1 = input.nextDouble();

        System.out.println("Please enter the second x-coordinate");
        x2 = input.nextDouble();
        System.out.println("Please enter the second y-coordinate");
        y2 = input.nextDouble();

        distance = sqrt(pow(x2-x1, 2) + pow(y2-y1, 2));

        System.out.println("The distance between those two points is " + distance + " units.");


    }
}
