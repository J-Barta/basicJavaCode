package com.company.Other;

public class BubbleSorter {

    public static void main(String[] args) {
        int size = 10;
        int original[] = new int[size];
        original[0] = 10;
        original[1] = 52;
        original[2] = 20;
        original[3] = 7;
        original[4] = 50;
        original[5] = 5;
        original[6] = 4;
        original[7] = 8;
        original[8] = 40;
        original[9] = 43;

        boolean change = true;
        while(change) {
            change = false;
            for(int i = 0; i < size-1; i++) {
                if(original[i] > original[i+1]) {
                    int cache = original[i];
                    original[i] = original[i+1];
                    original[i+1] = cache;
                    change = true;
                }
            }
        }

        System.out.println(original[0]);
        System.out.println(original[1]);
        System.out.println(original[2]);
        System.out.println(original[3]);
        System.out.println(original[4]);
        System.out.println(original[5]);
        System.out.println(original[6]);
        System.out.println(original[7]);
        System.out.println(original[8]);
        System.out.println(original[9]);


    }
}
