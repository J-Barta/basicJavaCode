package com.company.Other;

public class multiplication {
    public static int tick = 1;
    public static double result = 0;
    public static void main(String[] args) {


    }

    public static void multiply(double factor1, double factor2) {
        if(tick != factor2) {
            result = totalCount(result, factor1);
            tick ++;
        } else {

        }
        multiply(factor1, factor2);
        
    }

    public static double totalCount(double currentTotal, double numToAdd) {
        return currentTotal + numToAdd;
    }
}
