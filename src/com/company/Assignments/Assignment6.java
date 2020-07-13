package com.company.Assignments;

import java.util.Scanner;

public class Assignment6 {

    public static int randNum, guess, limit;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please give an upper limit for the random number.");
        limit = input.nextInt();
        randNum = (int)((Math.random()*limit)+1);

        System.out.println("Please guess a number between 1 and " + limit + ".");
        guess = input.nextInt();

        if(guess == randNum) {
            System.out.println("You guessed the number correctly!");
        } else {
            if(guess - randNum > 0) {
                System.out.println("lower");
            } else {
                System.out.println("higher");
            }
            guess = input.nextInt();
            if(guess == randNum) {
                System.out.println("You guessed the number correctly!");
            } else {
                System.out.println("You guessed wrong! The number was " + randNum);
            }
        }
    }
}
