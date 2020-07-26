package com.company.TryMes;

import java.util.Scanner;

public class TryMe7 {

    public static String fn, mn, ln;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first, middle, and last name.");

        fn = input.next();
        mn = input.next();
        ln = input.next();

        System.out.println(ln + ", " + fn);
        System.out.println(ln + ", " + fn + " " + mn);
        System.out.println(ln + ", " + fn + " " + mn.charAt(0) + ".");

        System.out.println(fn.charAt(0) + ". " + ln.charAt(0) + ". " + mn.charAt(0) + ".");

    }
}
