package com.company;
import java.util.Random;
import java.util.Scanner;
class Main {
    // public static void
    public static void main(String[] args) {
        Random rn = new Random();
        Pokemon using = new Pokemon();
        using.name = "place";
        using.level = 0;
        using.health = 0;
        Pokemon bulbasaur = new Pokemon();
        bulbasaur.name = "Bulbasaur";
        bulbasaur.level = 1;
        bulbasaur.health = 12 * (bulbasaur.level/2);
        bulbasaur.summonnum = 1;
        Pokemon squirtle = new Pokemon();
        squirtle.name = "Squirtle";
        squirtle.level = 1;
        squirtle.health = 15 * (squirtle.level/2);
        squirtle.summonnum = 2;
        Pokemon charmander = new Pokemon();
        charmander.name = "Charmander";
        charmander.level = 3;
        charmander.health = 20 * (charmander.level/2);
        charmander.summonnum = 3;
        Enemy box = new Enemy();
        box.name = "Box";
        box.health = 5;
        Enemy enemyusing = new Enemy();
        enemyusing.name = "place";
        enemyusing.health = 0;
        enemyusing.level = 0;
        Attack scrape = new Attack();
        scrape.name = "Scrape";
        scrape.dmg = rn.nextInt(6) * (using.level / 2);
        Attack enemyscrape = new Attack();
        enemyscrape.name = "";
        enemyscrape.dmg = rn.nextInt(6) * (enemyusing.level / 2);
        String pokeslot_one = "none";
        String pokeslot_two = "none";
        String pokeslot_three = "none";
        String pokeslot_four = "none";
        String pokeslot_five = "none";
        String pokeslot_six = "none";
        String move = "place";
        String move1 = "none";
        String move2 = "none";
        String move3 = "none";
        String move4 = "none";
        String battle = "place";
        int summon = 0;
        int wp = 0;
        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Welcome to my Pokemon Java Game!");
            Thread.sleep(2000);
            System.out.println("Time to pick your first pokemon!");
            Thread.sleep(2000);
            System.out.println("Lets see what we have here... \n");
            Thread.sleep(2000);
            System.out.println("Which one do you want? \n");
            System.out.println(" Charmander \n Squirtle \n Bulbasaur \n");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String starterselect = sc.nextLine();
        switch (starterselect){
            case "Charmander":
                System.out.println("You chose Charmander!");
                pokeslot_one = "Charmander";
                break;
            case "charmander":
                System.out.println("You chose Charmander!");
                pokeslot_one = "Charmander";
                break;
            case "Squirtle":
                System.out.println("You chose Squirtle!");
                pokeslot_one = "Squirtle";
                break;
            case "squirtle":
                System.out.println("You chose Squirtle!");
                pokeslot_one = "Squirtle";
            case "Bulbasuar":
                System.out.println("You chose Bulbasuar!");
                pokeslot_one = "Bulbasuar";
                break;
            case "bulbasuar":
                System.out.println("You chose Bulbasuar!");
                pokeslot_one = "Bulbasuar";
                break;
            default:
                System.out.println("Thats not one of the options. \n");
        }
        while (true){
            System.out.println("What do you want to do? \n \n Walk \n Bag \n Pokemon \n Pokedex \n ");
            String command = sc.nextLine();
            switch (command) {
                case "walk":
                    System.out.println("You walked forward. \n");
                    wp = wp + 1;
                    int battlechance = rn.nextInt(11);
                    if (battlechance > 5){
                        design();
                        switch (pokeslot_one){
                            case "Charmander":
                                using.name = charmander.name;
                                using.level = charmander.health;
                                using.health = charmander.level;
                                break;
                            case "Squirtle":
                                using.name = squirtle.name;
                                using.level = squirtle.level;
                                using.health = squirtle.health;
                                break;
                            case "Bulbasaur":
                                using.name = bulbasaur.name;
                                using.level = bulbasaur.level;
                                using.health = bulbasaur.health;
                                break;
                            default:
                                System.out.println("You don't have a pokemon!");
                                break;
                        }
                        if (wp > 50) {
                            summon = rn.nextInt(6);
                            summon = summon + 5;
                        } else if (wp > 100) {
                            summon = rn.nextInt(6);
                            summon = summon + 10;
                        } else if (wp > 150) {
                            summon = rn.nextInt(6);
                            summon = summon + 15;
                        } else if (wp > 200){
                            summon = rn.nextInt(6);
                            summon = summon + 20;
                        } else {
                            summon = rn.nextInt(6);
                        }
                        System.out.println("Summon = " + summon);
                        switch (summon) {
                            case 1:
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("");
                                break;
                        }
                        }

                    }
            }

        }
    public static void design(){
        try{
            System.out.println("             |             ");
            Thread.sleep(150);
            System.out.println("            |||            ");
            Thread.sleep(150);
            System.out.println("           |||||           ");
            Thread.sleep(150);
            System.out.println("          |||||||          ");
            Thread.sleep(150);
            System.out.println("         |||||||||         ");
            Thread.sleep(150);
            System.out.println("        |||||||||||        ");
            Thread.sleep(150);
            System.out.println("       |||||||||||||       ");
            Thread.sleep(150);
            System.out.println("      |||||||||||||||      ");
            Thread.sleep(150);
            System.out.println("     |||||||||||||||||     ");
            Thread.sleep(150);
            System.out.println("    |||||||||||||||||||    ");
            Thread.sleep(150);
            System.out.println("   |||||||||||||||||||||   ");
            Thread.sleep(150);
            System.out.println("  |||||||||||||||||||||||  ");
            Thread.sleep(150);
            System.out.println(" ||||||||||||||||||||||||| ");
            Thread.sleep(150);
            System.out.println("     BATTLE    START!      ");
            Thread.sleep(800);
            System.out.println(" ||||||||||||||||||||||||| ");
            Thread.sleep(150);
            System.out.println("  |||||||||||||||||||||||  ");
            Thread.sleep(150);
            System.out.println("   |||||||||||||||||||||   ");
            Thread.sleep(150);
            System.out.println("    |||||||||||||||||||    ");
            Thread.sleep(150);
            System.out.println("     |||||||||||||||||     ");
            Thread.sleep(150);
            System.out.println("      |||||||||||||||      ");
            Thread.sleep(150);
            System.out.println("       |||||||||||||       ");
            Thread.sleep(150);
            System.out.println("        |||||||||||        ");
            Thread.sleep(150);
            System.out.println("         |||||||||         ");
            Thread.sleep(150);
            System.out.println("          |||||||          ");
            Thread.sleep(150);
            System.out.println("           |||||           ");
            Thread.sleep(150);
            System.out.println("            |||            ");
            Thread.sleep(150);
            System.out.println("             |             ");
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}