package com.company.BattleBots;

import java.util.Scanner;

public class StatChanges {

    Scanner input = new Scanner(System.in);


    public void upgradeDamage(double num, Bot opponent, Bot self) {
        if (self.hp > num) {
            self.hp -= num;
            self.damage += num;
            System.out.println("Your health has decreased by " + num + " for an increase of " + num + " damage");
        }else {
            System.out.println("You can't take away all of your health! Please choose one that won't do that.");
            upgradeStat(opponent, self);
        }
    }

    public void upgradeArmor(double num, Bot self) {
        self.speed -= 0.5 * num;
        self.dodgeChance -= 0.5 * num;
        self.armor += num;
        System.out.println("Your speed and dodge chance have both decreased by " + 0.5 * num + " for an increase of " + num + " armor");
    }

    public void upgradeSpeed(double num, Bot self) {
        self.damage -= num;
        self.speed += num;
        System.out.println("Your damage has decreased by " + num + " for an increase of " + num + " speed");
    }

    public void upgradeDodge(double num, Bot self) {
        self.damage -= 0.5*num;
        self.armor -= 0.5*num;
        self.dodgeChance += num;
        System.out.println("Your damage and armor have each decreased by " + 0.5*num + " for an increase of " + num + " dodge chance");
    }

    public void upgradeStat(Bot opponent, Bot self) {
        self.printStats();
        opponent.printStats();

        System.out.print(self.name + ", what stat would you like to upgrade? Type 'speed' to upgrade speed, 'damage' to upgrade damage," +
                " \n'armor' to upgrade armor, 'dodge' to upgrade dodge chance, " +
                "or 'none' to keep your stats the same.\n " +
                "All stat increases come with another stat decrease.\n");
        String buildSelf = input.nextLine();

        if(buildSelf.equalsIgnoreCase("damage")) {
            this.upgradeDamage(5, opponent, self);
        }else if ( buildSelf.equalsIgnoreCase("speed")){
            this.upgradeSpeed(5, self);
        }else if (buildSelf.equalsIgnoreCase("armor")) {
            this.upgradeArmor(5, self);
        }else if (buildSelf.equalsIgnoreCase("dodge")) {
            this.upgradeDodge(5, self);
        } else if (buildSelf.equalsIgnoreCase("none")){
            System.out.println("You chose not to change your stats.");
        } else{
            System.out.println("Please enter one of the options");
            this.upgradeStat(opponent, self);
        }
    }
}
