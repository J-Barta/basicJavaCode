package com.company.BattleBots;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
    public static boolean valid = false;
    public static String choice1, choice2;
    public static Bot choiceBot1, choiceBot2;
    public static int notChoose;

    public static void main(String[] args) {
        Bot bot1 = new Bot("Bruiser", 75, 30, 15, 50, 25);
        Bot bot2 = new Bot("Tank", 100, 20, 50, 30, 0);
        Bot bot3 = new Bot("Quick Shot", 50, 15, 5, 50, 50);
        Bot bot4 = new Bot("Samurai", 60, 25, 10, 40, 40);

        Bot bots[] = {bot1, bot2, bot3, bot4};

        System.out.println("Player one, choose your fighter! The options are: ");
        sleep(500);
        bot1.printAllAttributes();
        sleep(500);
        bot2.printAllAttributes();
        sleep(500);
        bot3.printAllAttributes();
        sleep(500);
        bot4.printAllAttributes();
        sleep(500);

        System.out.println("Which do you want?");
        choice1 = input.nextLine();

        valid = false;
        while(!valid){
            valid = true;
            if (choice1.equalsIgnoreCase(bot1.name)){
                choiceBot1 = bot1;
                notChoose = 1;
            }else if(choice1.equalsIgnoreCase(bot2.name)){
                choiceBot1 = bot2;
                notChoose = 2;
            }else if(choice1.equalsIgnoreCase(bot3.name)){
                choiceBot1 = bot3;
                notChoose = 3;
            }else if(choice1.equalsIgnoreCase(bot4.name)){
                choiceBot1 = bot4;
                notChoose = 4;
            }else{
                System.out.println("Please enter a valid robot name: ");
                choice1 = input.nextLine();
                valid = false;
            }
        }
        System.out.println("Player two, choose your fighter! The options are: ");
        sleep(1000);

        if(notChoose != 1){
            bot1.printAllAttributes();
            sleep(500);
        }if(notChoose != 2){
            bot2.printAllAttributes();
            sleep(500);
        }if(notChoose != 3) {
            bot3.printAllAttributes();
            sleep(500);
        }if(notChoose != 4) {
            bot4.printAllAttributes();
            sleep(500);
        }

        System.out.println("Which do you want?");
        choice2 = input.nextLine();

        valid = false;
        while(!valid){
            valid = true;

            if(choice2.equalsIgnoreCase(bot1.name) && notChoose !=1){
                choiceBot2 = bot1;
            }else if(choice2.equalsIgnoreCase(bot2.name) && notChoose !=2){
                choiceBot2 = bot2;
            }else if(choice2.equalsIgnoreCase(bot3.name) && notChoose !=3){
                choiceBot2 = bot3;
            }else if(choice2.equalsIgnoreCase(bot4.name) && notChoose != 4){
                choiceBot2=bot4;
            }else{
                System.out.println("Please enter a valid robot name that has not been chosen: ");
                choice2 = input.nextLine();
                valid = false;
            }
        }
        System.out.println(choiceBot1.name + " VS. " + choiceBot2.name);
        choiceBot1.fight(choiceBot2);

    }

    public static void sleep(int time) {
            try {
                Thread.sleep(time);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

}
