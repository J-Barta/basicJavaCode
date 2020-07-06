package com.company.Other;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean Continue = true;
        boolean understood = false;
        while(Continue) {
            System.out.println("Finish the Number Sequence: 0, 1, 1, 2, 3, 5, 8, ___, 21");
            int num = myObj.nextInt();
            if(num == 13) {
                System.out.println("You are correct!");
            } else {
                System.out.println("YOU FAILED!!!!!!!!!!!!!!!! :(");
            }
            System.out.println("Would you like to continue? 1 for yes, 0 for no");
            understood = false;
            while (!understood) {
                int keepGoing = myObj.nextInt();
                if(keepGoing == 0) {
                    Continue = false;
                    understood = true;
                } else if (keepGoing == 1) {
                    Continue = true;
                    understood = true;
                }
            }

        }

    }
}
