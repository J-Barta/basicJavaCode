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
            if (opponent.hp< 0) {
                opponent.hp = 0;
            }
            System.out.println(this.name + " did " + totalDamage + " damage to " + opponent.name + ", who is now at " +
                this.hp + " health.");
        } else{
            System.out.println(opponent.name + " dodged " + this.name + "'s attack!");
        }
    }

    public void printStats() {
        System.out.println(this.name + "'s current stats are:\nSpeed: " + this.speed + ", health: " +
                this.hp + ", damage: " + this.damage + ", armor: " + this.armor + ", dodge chance: " + this.dodgeChance);
    }


}
