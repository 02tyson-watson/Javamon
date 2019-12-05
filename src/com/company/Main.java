package com.company;
import java.util.Scanner;
class Main {
    // public static void
    public static void main(String[] args) {
        Pokemon bulbasaur = new Pokemon();
        bulbasaur.name = "Bulbasaur";
        bulbasaur.level = 1;
        bulbasaur.health = 12 * (bulbasaur.level/2);
        Pokemon squirtle = new Pokemon();
        squirtle.name = "Squirtle";
        squirtle.level = 1;
        squirtle.health = 15 * (squirtle.level/2);
        Pokemon charmander = new Pokemon();
        charmander.name = "Charmander";
        charmander.level = 3;
        charmander.health = 20 * (charmander.level/2);
        Attack scrape = new Attack();
        scrape.name = "Scrape";
        scrape.dmg = 2;
        String pokeslot1 = "none";
        String pokeslot2 = "none";
        String pokeslot3 = "none";
        String pokeslot4 = "none";
        String pokeslot5 = "none";
        String pokeslot6 = "none";
        String move = "place";
        String move1 = "none";
        String move2 = "none";
        String move3 = "none";
        String move4 = "none";
        String battle = "place";
        Scanner sc = new Scanner(System.in);
        Enemy box = new Enemy();
        box.name = "Box";
        box.health = 5;

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
                break;
            case "charmander":
                System.out.println("You chose Charmander!");
                break;
            case "Squirtle":
                System.out.println("You chose Squirtle!");
                break;
            case "squirtle":
                System.out.println("You chose Squirtle!");
                break;
            case "Bulbasuar":
                System.out.println("You chose Bulbasuar!");
                break;
            case "bulbasuar":
                System.out.println("You chose Bulbasuar!");
                break;
            default:
                System.out.println("Thats not one of the options. \n");
        }




    }
}
