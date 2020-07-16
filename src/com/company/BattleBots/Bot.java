package com.company.BattleBots;

import java.util.Random;
import java.util.Scanner;

public class Bot {
    public String name;
    public double hp;
    public double damage;
    public double armor;
    public double speed;
    public double dodgeChance;

    public static Scanner input = new Scanner(System.in);
    public static Random rand = new Random();

    public Bot(String name, double hp, double damage, double armor, double speed, double dodgeChance) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
        this.speed = speed;
        this.dodgeChance = dodgeChance;
    }

    public void dealDamage(Bot opponent) {
        Random rand = new Random();
        if(rand.nextInt(100) > opponent.dodgeChance){
            double totalDamage = this.damage * (1 - (opponent.armor / 100));
            opponent.hp -= totalDamage;
            if (opponent.hp < 0) {
                opponent.hp = 0;
            }
            System.out.println(this.name + " did " + totalDamage + " damage to " + opponent.name + ", who is now at " +
                this.hp + " health.");
        } else{
            System.out.println(opponent.name + " dodged " + this.name + "'s attack!");
        }
    }

    public void askBuild(Bot opponent) {
        this.upgradeStat(opponent);
        this.equalizeStats();
        opponent.upgradeStat(this);
        opponent.equalizeStats();
    }

    public void fight(Bot opponent){
        while(this.isAlive() && opponent.isAlive()) {
            this.askBuild(opponent);
            int order = this.AssignFightOrder(opponent);
            if (order == 1) {
                this.dealDamage(opponent);
                if (!opponent.isAlive()) {
                    break;
                }
                sleep(500);
                opponent.dealDamage(this);
                if (!this.isAlive()) {
                    break;
                }
                sleep(1000);
                System.out.println();
            } else if (order == 0) {
                opponent.dealDamage(this);
                if (!this.isAlive()) {
                    break;
                }
                sleep(500);
                this.dealDamage(opponent);
                if (!opponent.isAlive()) {
                    break;
                }
                sleep(1000);
                System.out.println();
            } else {
                boolean randBool = rand.nextBoolean();
                if(randBool) {
                    this.dealDamage(opponent);
                    if(!opponent.isAlive()) {
                        break;
                    }
                    sleep(500);
                    opponent.dealDamage(this);
                } else {
                    opponent.dealDamage(this);
                    if (!this.isAlive()) {
                        break;
                    }
                    sleep(500);
                    this.dealDamage(opponent);

                }
                sleep(1000);
                System.out.println();

            }
        }
        if(this.isAlive()){
                System.out.println(this.name + " has won!");
        }else{
            System.out.println(opponent.name + " has won!");
        }
    }

    public void equalizeStats() {
        if(this.damage < 0) {
            this.damage = 0;
        }
        if(this.armor < 0) {
            this.armor = 0;
        }
        if(this.speed < 0) {
            this.speed = 0;
        }
        if(this.dodgeChance < 0) {
            this.dodgeChance = 0;
        }
    }

    public boolean checkContinue(Bot opponent) {
        return (this.isAlive() && opponent.isAlive());
    }

    public boolean isAlive(){
        return (this.hp > 0);
    }

    public int AssignFightOrder(Bot opponent) {
        if (this.speed > opponent.speed){
            return 1;
        }else if (this.speed > opponent.speed){
            return 0;
        } else {
            return 2;
        }
    }


    public void printStats() {
        System.out.println(this.name + "'s current stats are:\nSpeed: " + this.speed + ", health: " +
                this.hp + ", damage: " + this.damage + ", armor: " + this.armor + ", dodge chance: " + this.dodgeChance);
    }

    public void upgradeDamage(double num, Bot opponent) {
        if (this.hp > num) {
            this.hp -= num;
            this.damage += num;
            System.out.println("Your health has decreased by " + num + " for an increase of " + num + " damage");
        }else{
            System.out.println("You can't take away all of your health! Please choose one that won't do that.");
            this.upgradeStat(opponent);
        }
    }

    public void upgradeArmor(double num) {
        this.speed -= 0.5 * num;
        this.dodgeChance -= 0.5 * num;
        this.armor += num;
        System.out.println("Your speed and dodge chance have both decreased by " + 0.5 * num + " for an increase of " + num + " armor");
    }

    public void upgradeSpeed(double num) {
        this.damage -= num;
        this.speed += num;
        System.out.println("Your damage has decreased by " + num + " for an increase of " + num + " speed");
    }

    public void upgradeDodge(double num) {
        this.damage -= 0.5*num;
        this.armor -= 0.5*num;
        this.dodgeChance += num;
        System.out.println("Your damage and armor have each decreased by " + 0.5*num + " for an increase of " + num + " dodge chance");
    }

    public void upgradeStat(Bot opponent) {
        this.printStats();
        opponent.printStats();

        System.out.print(this.name + ", what stat would you like to upgrade? Type 'speed' to upgrade speed, 'damage' to upgrade damage," +
                " \n'armor' to upgrade armor, 'dodge' to upgrade dodge chance, " +
                "or 'none' to keep your stats the same.\n " +
                "All stat increases come with another stat decrease.\n");
        String buildSelf = input.nextLine();

        if(buildSelf.equalsIgnoreCase("damage")) {
            this.upgradeDamage(5, opponent);
        }else if ( buildSelf.equalsIgnoreCase("speed")){
            this.upgradeSpeed(5);
        }else if (buildSelf.equalsIgnoreCase("armor")) {
            this.upgradeArmor(5);
        }else if (buildSelf.equalsIgnoreCase("dodge")) {
            this.upgradeDodge(5);
        } else if (buildSelf.equalsIgnoreCase("none")){
            System.out.println("You chose not to change your stats.");
        } else{
            System.out.println("Please enter one of the options");
            this.upgradeStat(opponent);
        }
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public void printAllAttributes(){
        System.out.println(this.name + ": Health: " + this.hp + ", Damage: "
                + this.damage + ", Armor: " + this.armor + ", Speed: "
                + this.speed + ", Dodge Chance: " + this.dodgeChance);
    }


}
