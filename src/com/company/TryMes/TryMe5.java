package com.company.TryMes;

import java.util.Scanner;

public class TryMe5 {

    public static int month, day;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a month as an integer.");
        month = input.nextInt();

        System.out.println("Please enter the day as an integer.");
        day = input.nextInt();

        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 12:
                if (day >= 1 && day <= 31) {
                    System.out.println("You entered a valid date.");
                } else {
                    System.out.println("Invalid date!");
                }
                break;
            case 4:
            case 6:
            case 10:
            case 11:
                if (day >= 1 && day <= 30) {
                    System.out.println("You entered a valid date.");
                } else {
                    System.out.println("Invalid date!");
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    System.out.println("You entered a valid date.");
                } else {
                    System.out.println("Invalid date!");
                }
                break;
            default:
                System.out.println("Invalid date!");
        }
    }
}
