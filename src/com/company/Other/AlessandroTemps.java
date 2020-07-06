package com.company.Other;

import java.util.Scanner;

//Jacob Barta
//June 23 2020

public class AlessandroTemps{

    public static double Fahrenheit, Celsius;

    public static void main(String[]args){

        //Scanner Variable
        Scanner input= new Scanner(System.in);

        //User enters Temp. in Fahrenheit
        System.out.print("Enter Fahrenheit Temperature: ");
        Fahrenheit = input.nextDouble();

        //Convert to Celci.
        Celsius = (Fahrenheit-32) * 5.0/9;

        //Display
        System.out.println(Fahrenheit  + " degrees Fahrenheit is " + Celsius + " degrees Celsius");

    }
}