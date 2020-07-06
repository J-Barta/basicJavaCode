package com.company.Assignments;

import java.util.Scanner;

public class Assignment4 {

    public static boolean valid = false;
    public static int month;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a month of the year as an integer: ");
        month = input.nextInt();
        while(!valid) {
            if(month>0 && month<13) {
                valid = true;
            } else{
                System.out.print("Please enter a valid month of the year as an integer: ");
                month = input.nextInt();
            }
        }

        System.out.print("Please enter a day value: ");
        int day = input.nextInt();
        valid = false;
        while(!valid){
            if(day > 0){
                valid = true;
            } else{
                System.out.print("Please enter a positive day value:");
                day = input.nextInt();
            }
        }

        String monthNames[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int length[] = {31, 29, 31, 30, 31, 30, 31, 31, 31, 31, 30, 31};

        if(day <= length[month-1]){
            System.out.println(monthNames[month-1] + " " + day + " is a valid day.");
        } else{
            System.out.println(monthNames[month-1] + " doesn't have a " + day + ".");
        }
    }
}