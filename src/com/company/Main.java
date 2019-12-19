package com.company;
import java.util.Random;
import java.util.Scanner;

class Main {
    // public static void
    public static void main(String[] args) {
        try{
            Random rn = new Random();
            Pokemon using = new Pokemon();
            using.name = "place";
            using.level = 2;
            using.health = 0;
            Pokemon bulbasaur = new Pokemon();
            bulbasaur.name = "Bulbasaur";
            bulbasaur.level = 2;
            bulbasaur.health = 45 * (bulbasaur.level / 2);
            bulbasaur.summonnum = 1;
            Pokemon ivysuar = new Pokemon();
            ivysuar.name = "Ivysuar";
            ivysuar.level = 16;
            ivysuar.health = 60 * (ivysuar.level / 3);
            ivysuar.summonnum = 2;
            Pokemon venusuar = new Pokemon();
            venusuar.name = "Venusuar";
            venusuar.level = 32;
            venusuar.health = 80 * (venusuar.level / 4);
            venusuar.summonnum = 3;
            Pokemon squirtle = new Pokemon();
            squirtle.name = "Squirtle";
            squirtle.level = 2;
            squirtle.health = 15 * (squirtle.level / 2);
            squirtle.summonnum = 4;
            Pokemon wartortle = new Pokemon();
            wartortle.name = "Wartortle";
            wartortle.level = 16;
            wartortle.health = 59 * (wartortle.level / 3);
            wartortle.summonnum = 5;
            Pokemon blastoise = new Pokemon();
            blastoise.name = "Blastoise";
            blastoise.level = 36;
            blastoise.health = 79 * (blastoise.level / 4);
            Pokemon charmander = new Pokemon();
            charmander.name = "Charmander";
            charmander.level = 2;
            charmander.health = 39 * (charmander.level / 2);
            charmander.summonnum = 4;
            Pokemon charmeleon = new Pokemon();
            charmeleon.name = "Charmeleon";
            charmeleon.level = 16;
            charmeleon.health = 58 * (charmeleon.level / 3);
            charmeleon.summonnum = 5;
            Pokemon charizard = new Pokemon();
            charizard.name = "Charizard";
            charizard.level = 36;
            charizard.health = 78 * (charizard.level / 4);
            Enemy box = new Enemy();
            box.name = "Box";
            box.health = 5;
            Enemy enemyusing = new Enemy();
            enemyusing.name = "place";
            enemyusing.health = 0;
            enemyusing.level = 2;
            Attack scrape = new Attack();
            scrape.name = "Scrape";
            scrape.dmg = rn.nextInt(10);
            scrape.atknum = 1;
            Attack tackle = new Attack();
            tackle.name = "Tackle";
            tackle.dmg = rn.nextInt(15);
            tackle.atknum = 2;
            Attack bodyslam = new Attack();
            bodyslam.name = "Bodyslam";
            bodyslam.dmg = rn.nextInt(20) + 2;
            bodyslam.atknum = 3;
            Attack ember = new Attack();
            ember.name = "Ember";
            ember.dmg = rn.nextInt(20) + 5;
            ember.atknum = 4;
            Attack firefang = new Attack();
            firefang.name = "Fire Fang";
            firefang.dmg = rn.nextInt(40) + 10;
            firefang.atknum = 5;
            Attack flamethrower = new Attack();
            flamethrower.name = "Flamethrower";
            flamethrower.dmg = rn.nextInt(80) + 15;
            flamethrower.atknum = 6;
            Attack bubblebeam = new Attack();
            bubblebeam.name = "Bubble Beam";
            bubblebeam.dmg = rn.nextInt(20) + 5;
            bubblebeam.atknum = 7;
            Attack watergun = new Attack();
            watergun.name = "Water Gun";
            watergun.dmg = rn.nextInt(40) + 10;
            Attack hydropump = new Attack();
            hydropump.name = "Hydro Pump";
            hydropump.dmg = rn.nextInt(80) + 15;
            hydropump.atknum = 9;
            Attack razorleaf = new Attack();
            razorleaf.name = "Razor Leaf";
            razorleaf.dmg = rn.nextInt(20) + 5;
            razorleaf.atknum = 10;
            Attack sting = new Attack();
            sting.name = "Poison Sting";
            sting.dmg = rn.nextInt(40) + 10;
            sting.atknum = 11;
            Attack vinewhip = new Attack();
            vinewhip.name = "Vinewhip";
            vinewhip.dmg = rn.nextInt(80) + 15;
            vinewhip.atknum = 12;
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
            int enemyatk = 0;
            int atkgetchance = 0;
            int atkget = 0;
            int summon = 0;
            int wp = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to my Pokemon Java Game!");
            Thread.sleep(1000);
            System.out.println("Time to pick your first pokemon!");
            Thread.sleep(1000);
            System.out.println("Lets see what we have here... \n");
            Thread.sleep(1000);
            System.out.println("Which one do you want? \n");
            System.out.println(" Charmander \n Squirtle \n Bulbasaur \n");
            Thread.sleep(1000);
            String starterselect = sc.nextLine();
            switch (starterselect) {
                case "Charmander":
                case "charmander":
                    System.out.println("You chose Charmander! \n");
                    pokeslot_one = "Charmander";
                    break;
                case "Squirtle":
                case "squirtle":
                    System.out.println("You chose Squirtle! \n");
                    pokeslot_one = "Squirtle";
                    break;
                case "Bulbasuar":
                case "bulbasuar":
                    System.out.println("You chose Bulbasuar! \n");
                    pokeslot_one = "Bulbasuar";
                    break;
                default:
                    System.out.println("Thats not one of the options. \n");
            }
            System.out.println("Time to pick your first Attack for your pokemon! \n");
            Thread.sleep(2000);
            System.out.println("Which one do you want your Pokemon to learn first? \n");
            Thread.sleep(500);
            System.out.println("Scrape \n");
            Thread.sleep(250);
            System.out.println("Tackle \n");
            Thread.sleep(250);
            System.out.println("Body Slam\n");
            Thread.sleep(250);
            System.out.println(" \n");
            String atkselect = sc.nextLine();
            switch(atkselect){
                case "Scrape":
                case "scrape":
                    System.out.println("You chose Scrape!");
                    move1 = "Scrape";
                    break;
                case "Tackle":
                case "tackle":
                    System.out.println("You chose Tackle!");
                    move1 = "Tackle";
                    break;
                case "Body Slam":
                case "Body slam":
                case "body slam":
                    System.out.println("You chose Body Slam.");
                    move1 = "Body Slam";
                    break;
                default:
                    System.out.println("That's not one of the options.");
                    break;
            }
            while (true) {
                System.out.println("What do you want to do? \n \n Walk \n Bag \n Pokemon \n Pokedex \n ");
                String command = sc.nextLine();
                switch (command) {
                    case "walk":
                    case "Walk":
                        System.out.println("You walked forward. \n");
                        wp = wp + 1;
                        int battlechance = rn.nextInt(11);
                        if (battlechance > 5) {
                            design();
                            switch (pokeslot_one) {
                                case "Charmander":
                                    using.name = charmander.name;
                                    using.level = charmander.level;
                                    using.health = charmander.health;
                                    break;
                                case "Charmeleon":
                                    using.name = charmeleon.name;
                                    using.level = charmeleon.level;
                                    using.health = charmeleon.health;
                                    break;
                                case "Charizard":
                                    using.name = charizard.name;
                                    using.level = charizard.level;
                                    using.health = charizard.health;
                                    break;
                                case "Squirtle":
                                    using.name = squirtle.name;
                                    using.level = squirtle.level;
                                    using.health = squirtle.health;
                                    break;
                                case "Wartortle":
                                    using.name = wartortle.name;
                                    using.level = wartortle.level;
                                    using.health = wartortle.health;
                                    break;
                                case "Blastoise":
                                    using.name = blastoise.name;
                                    using.level = blastoise.level;
                                    using.health = blastoise.health;
                                    break;
                                case "Bulbasaur":
                                    using.name = bulbasaur.name;
                                    using.level = bulbasaur.level;
                                    using.health = bulbasaur.health;
                                    break;
                                case "Ivysuar":
                                    using.name = ivysuar.name;
                                    using.level = ivysuar.level;
                                    using.health = ivysuar.health;
                                    break;
                                case "Venusuar":
                                    using.name = venusuar.name;
                                    using.level = venusuar.level;
                                    using.health = venusuar.health;
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
                            } else if (wp > 200) {
                                summon = rn.nextInt(6);
                                summon = summon + 20;
                            } else {
                                summon = rn.nextInt(3);
                                summon = summon + 1;
                            }
                            System.out.println("Summon = " + summon);
                            switch (summon) {
                                case 1:
                                    wild("Bulbasaur");
                                    enemyusing.name = bulbasaur.name;
                                    enemyusing.level = bulbasaur.level;
                                    enemyusing.health = bulbasaur.health;
                                    break;
                                case 2:
                                    System.out.println();
                                    wild("Squirtle");
                                    enemyusing.name = squirtle.name;
                                    enemyusing.level = squirtle.level;
                                    enemyusing.health = squirtle.health;
                                    break;
                                case 3:
                                    wild("Charmander");
                                    enemyusing.name = charmander.name;
                                    enemyusing.level = charmander.level;
                                    enemyusing.health = charmander.health;
                                    break;
                            }
                            while (using.health > 0 && enemyusing.health > 0) {
                                System.out.println("What will you do? \n");
                                Thread.sleep(1000);
                                System.out.println("Attack \n");
                                Thread.sleep(250);
                                System.out.println("Run \n");
                                Thread.sleep(250);
                                System.out.println("Bag \n");
                                Thread.sleep(250);
                                System.out.println("Pokemon \n");
                                Thread.sleep(250);
                                String battlecommand = sc.nextLine();
                                switch (battlecommand) {
                                    case "attack":
                                    case "Attack":
                                        System.out.println("What attack will you do? \n");
                                        Thread.sleep(250);
                                        System.out.println(move1);
                                        Thread.sleep(250);
                                        System.out.println(move2);
                                        Thread.sleep(250);
                                        System.out.println(move3);
                                        Thread.sleep(250);
                                        System.out.println(move4);
                                        String atkslct = sc.nextLine();
                                        switch(atkslct){
                                            case "Scrape":
                                            case "scrape":
                                                scrape.dmg = rn.nextInt(8);
                                                System.out.println(using.name + " used Scrape!");
                                                Thread.sleep(1000);
                                                enemyusing.health = enemyusing.health - scrape.dmg;
                                                System.out.println("Your " + pokeslot_one + " did " + bodyslam.dmg + " damage!");
                                                Thread.sleep(1000);
                                                System.out.println("Enemy " + enemyusing.name + " health:" + enemyusing.health);
                                                Thread.sleep(1000);
                                                break;
                                            case "Tackle":
                                            case "tackle":
                                                tackle.dmg = rn.nextInt(10);
                                                System.out.println(using.name + " used Tackle!");
                                                Thread.sleep(1000);
                                                enemyusing.health = enemyusing.health - tackle.dmg;
                                                System.out.println("Your " + pokeslot_one + " did " + tackle.dmg + " damage!");
                                                Thread.sleep(1000);
                                                System.out.println("Enemy " + enemyusing.name + " health:" + enemyusing.health);
                                                Thread.sleep(1000);
                                                break;
                                            case "Body Slam":
                                            case "body slam":
                                            case "Body slam":
                                                bodyslam.dmg = rn.nextInt(15) + 2;
                                                System.out.println(using.name + " used Body Slam!");
                                                Thread.sleep(1000);
                                                enemyusing.health = enemyusing.health - bodyslam.dmg;
                                                System.out.println("Your " + pokeslot_one + " did " + bodyslam.dmg + " damage!");
                                                Thread.sleep(1000);
                                                System.out.println("Enemy " + enemyusing.name + " health:" + enemyusing.health);
                                                Thread.sleep(1000);
                                                break;
                                            case "ember":
                                            case "Ember":
                                                ember.dmg = rn.nextInt(20) + 2;
                                                System.out.println(using.name + " used Ember!");
                                                Thread.sleep(1000);
                                                enemyusing.health = enemyusing.health - ember.dmg;
                                                System.out.println("Your " + pokeslot_one + " did " + ember.dmg + " damage!");
                                                Thread.sleep(1000);
                                                System.out.println("Enemy " + enemyusing.name + " health:" + enemyusing.health);
                                                Thread.sleep(1000);
                                            case "Fire Fang":
                                            case "fire fang":
                                            case "Fire fang":
                                                firefang.dmg = rn.nextInt(40) + 2;
                                                System.out.println(using.name + " used Fire Fang!");
                                                Thread.sleep(1000);
                                                enemyusing.health = enemyusing.health - firefang.dmg;
                                                System.out.println("Your " + pokeslot_one + " did " + firefang.dmg + " damage!");
                                                Thread.sleep(1000);
                                                System.out.println("Enemy " + enemyusing.name + " health:" + enemyusing.health);
                                                Thread.sleep(1000);
                                            case "Flamethrower":
                                            case "flamethrower":
                                                flamethrower.dmg = rn.nextInt(80) + 2;
                                                System.out.println(using.name + " used Flamethrower!");
                                                Thread.sleep(1000);
                                                enemyusing.health = enemyusing.health - flamethrower.dmg;
                                                System.out.println("Your " + pokeslot_one + " did " + flamethrower.dmg + " damage!");
                                                Thread.sleep(1000);
                                                System.out.println("Enemy " + enemyusing.name + " health:" + enemyusing.health);
                                                Thread.sleep(1000);
                                            case "Bubble beam":
                                            case "Bubble Beam":
                                            case "bubble beam":
                                                bubblebeam.dmg = rn.nextInt(20) + 2;
                                                System.out.println(using.name + " used Bubble Beam!");
                                                Thread.sleep(1000);
                                                enemyusing.health = enemyusing.health - bubblebeam.dmg;
                                                System.out.println("Your " + pokeslot_one + " did " + bubblebeam.dmg + " damage!");
                                                Thread.sleep(1000);
                                                System.out.println("Enemy " + enemyusing.name + " health:" + enemyusing.health);
                                                Thread.sleep(1000);
                                            case "Water gun":
                                            case "water gun":
                                            case "Water Gun":
                                                watergun.dmg = rn.nextInt(40) + 2;
                                                System.out.println(using.name + " used Water Gun!");
                                                Thread.sleep(1000);
                                                enemyusing.health = enemyusing.health - watergun.dmg;
                                                System.out.println("Your " + pokeslot_one + " did " + watergun.dmg + " damage!");
                                                Thread.sleep(1000);
                                                System.out.println("Enemy " + enemyusing.name + " health:" + enemyusing.health);
                                                Thread.sleep(1000);
                                            default:
                                                System.out.println("Because you didn't type the attack correctly you give up your turn.");
                                                Thread.sleep(1000);
                                                break;
                                        }
                                    case "Pokemon":
                                        System.out.println("Here are your current Pokemon: \n");
                                        Thread.sleep(500);
                                        System.out.println(pokeslot_one + "\n");
                                        Thread.sleep(500);
                                        System.out.println(pokeslot_two + "\n");
                                        Thread.sleep(500);
                                        System.out.println(pokeslot_three + "\n");
                                        Thread.sleep(500);
                                        System.out.println(pokeslot_four + "\n");
                                        Thread.sleep(500);
                                        System.out.println(pokeslot_five + "\n");
                                        Thread.sleep(500);
                                        System.out.println(pokeslot_six + "\n");
                                        break;
                                    case "Bag":
                                        System.out.println("You have nothing in your bag!");
                                        Thread.sleep(1000);
                                    case "Run":
                                        System.out.println("The  enemy" + enemyusing.name + " has you in their grasp! You can't Escape!");
                                        Thread.sleep(1000);
                                }
                                switch (enemyusing.name){
                                    case "Charmander":
                                    case "Bulbasaur":
                                    case "Squirtle":
                                        enemyatk = rn.nextInt(3) + 1;
                                }
                                switch (enemyatk){
                                    case 1:
                                        scrape.dmg = rn.nextInt(8);
                                        System.out.println("Enemy " + enemyusing.name + " used Scrape!");
                                        Thread.sleep(1000);
                                        using.health = using.health - scrape.dmg;
                                        System.out.println("Your health: " + using.health);
                                        Thread.sleep(1000);
                                        break;
                                    case 2:
                                        tackle.dmg = rn.nextInt(10);
                                        System.out.println("Enemy " + enemyusing.name + " used Tackle!");
                                        Thread.sleep(1000);
                                        using.health = using.health - tackle.dmg;
                                        System.out.println("Your health: " + using.health);
                                        Thread.sleep(1000);
                                        break;
                                    case 3:
                                        bodyslam.dmg = rn.nextInt(15) + 2;
                                        System.out.println("Enemy " + enemyusing.name + " used Bodyslam!");
                                        Thread.sleep(1000);
                                        using.health = using.health - bodyslam.dmg;
                                        System.out.println("Your health: " + using.health);
                                        Thread.sleep(1000);
                                        break;
                                }
                            }
                            if (using.health > 0){
                                System.out.println("You win! \n Pokemon Level +1");
                                switch (using.name){
                                    case "Charmander":
                                        charmander.level = charmander.level + 1;
                                        System.out.println("Charmander is now level " + charmander.level + " !");
                                        charmander.health = 20 * (charmander.level / 2);
                                        if (charmander.level == 16){
                                            System.out.println("Whats this?");
                                            Thread.sleep(2000);
                                            System.out.println("Charmander is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Charmander is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Charmander is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Charmander is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Charmander is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Charmander evolved into Charmeleon!");
                                            Thread.sleep(500);
                                            System.out.println("*Charmeleon noise*");
                                            pokeslot_one = "Charmeleon";
                                            Thread.sleep(1000);
                                            System.out.println("Charmeleon Learned Fire Fang!");
                                            move3 = "Fire Fang";
                                        } else if (charmander.level == 5) {
                                            System.out.println("Charmander Learned Ember!");
                                            move2 = "Ember";
                                        } else {}
                                        break;
                                    case "Charmeleon":
                                        charmeleon.level = charmeleon.level + 1;
                                        System.out.println("Charmeleon is now level " + charmeleon.level);
                                        charmeleon.health = 58 * (charmeleon.level / 3);
                                        if (charmeleon.level == 36){
                                            System.out.println("Whats this?");
                                            Thread.sleep(2000);
                                            System.out.println("Charmeleon is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Charmeleon is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Charmeleon is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Charmeleon is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Charmeleon is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Charmeleon evolved into Charizard!");
                                            Thread.sleep(1000);
                                            System.out.println("Charizard Learned Flamethrower!");
                                            move4 = "Flamethrower";
                                        }
                                        break;
                                    case "Charizard":
                                        charizard.level = charizard.level + 1;
                                        System.out.println("Charizard is now level " + charizard.level);
                                        charizard.health = 78 * (charizard.level / 4);
                                        break;
                                    case "Squirtle":
                                        squirtle.level = squirtle.level + 1;
                                        System.out.println("Squirtle is now level " + squirtle.level);
                                        squirtle.health = 15 * (squirtle.level / 2);
                                        if (squirtle.level == 5){
                                            System.out.println("Squirtle learned Bubble Beam!");
                                            move2 = "Bubble Beam";
                                            Thread.sleep(1000);
                                        } else if (squirtle.level == 16){
                                            System.out.println("What's this?");
                                            Thread.sleep(2000);
                                            System.out.println("Squirtle is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Squirtle is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Squirtle is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Squirtle is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Squirtle is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Squirtle evolved into Wartortle!");
                                            Thread.sleep(1000);
                                            System.out.println("Wartortle learned Water Gun!");
                                            move3 = "Water Gun";
                                            pokeslot_one = "Wartortle";
                                        }
                                        break;
                                    case "Wartortle":
                                        wartortle.level = wartortle.level + 1;
                                        System.out.println("Wartortle is now level " + wartortle.level);
                                        wartortle.health = 59 * (wartortle.level / 3);
                                        if (wartortle.level == 36){
                                            System.out.println("Whats this?");
                                            Thread.sleep(2000);
                                            System.out.println("Squirtle is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Squirtle is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Squirtle is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Squirtle is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Squirtle is evolving!");
                                            Thread.sleep(1000);
                                            System.out.println("Squirtle evolved into Wartortle!");
                                            Thread.sleep(1000);
                                        }
                                    case "Blastoise":
                                    case "Bulbasaur":
                                        bulbasaur.level = bulbasaur.level + 1;
                                        bulbasaur.health = 12 * (bulbasaur.level / 2);
                                        break;
                                    case "Ivysuar":
                                    case "Venusuar":
                                }

                                atkgetchance = rn.nextInt(50);
                                if (atkgetchance > 45){
                                    System.out.println("FREE ATTACK!");
                                    System.out.println("Choose from these!");
                                }
                            } else {
                                System.out.println("Wow you suck.");
                            }
                        }
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void design() {
        try {
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

    public static void wild(String monster) {
        System.out.println("A wild " + monster + " appears!");
    }
}