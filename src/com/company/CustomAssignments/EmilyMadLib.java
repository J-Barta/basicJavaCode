package com.company.CustomAssignments;

import java.util.Scanner;

public class EmilyMadLib {

    public static Scanner input = new Scanner(System.in);
    public static String name1, name2, noun1, noun2, noun3, adjective1, verb1, animal1;
    public static void main(String[] args) {

        System.out.println("Welcome to Jacob's Wonderful MADLIB of Happiness and Joy and Wonder and Happiness");

        name1 = input("name");
        name2 = input("another name");

        noun1 = input("singular noun");

        System.out.println("Please enter another singular noun.");
        noun2 = input.nextLine();

        noun3 = input("third noun");

        adjective1 = input("adjective");

        verb1 = input("verb ending in 'ing'");

        animal1 = input("animal");

        System.out.println("One day, " + name1 + " was going to the store with " + name2 + ".");
        System.out.println("They had to buy some things, which included a(n) " + noun1 + ".");
        System.out.println("However, they found that the store did not have a(n) " + noun1 + ", ");
        System.out.println("so they got a(n)" + noun2 + " instead. They figured it would work out fine. However, once they were done ");
        System.out.println(verb1 + " at the store, they found out that their new " + noun2 + " was too " + adjective1);
        System.out.println("and they had to take it back to the store. Thankfully, a " + animal1 + " came along and gave them a(n) ");
        System.out.println(noun3 + ", which ended up working out fine.");

    }

    public static String input(String type) {
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        boolean an = false;
        while(count<5) {
            if(type.charAt(0) == vowels[count]) {
                an = true;
            }
            count++;
        }
        if(an) {
            System.out.println("Please enter an " + type + ".");
        } else {
            System.out.println("Please enter a " + type + ".");
        }

        String word = input.nextLine();
        return word;
    }
}
