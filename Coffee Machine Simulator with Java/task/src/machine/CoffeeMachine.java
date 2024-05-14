package machine;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit)");

            String answer = scan.next();
            if (answer.equals("buy")) {
                System.out.println("What do you want to buy? 1- espresso/2- latte/3- cappuccino/back- to main menu");
                String input = scan.next();

                if (input.equals("back")) {
                    System.out.println("Returning to main cycle");
                    continue;
                }
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        if (water < 250) {
                            System.out.println("Sorry, not enough water!");
                        } else if (beans < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (money < 4) {
                            System.out.println("Sorry, not enough money!");
                        } else {
                            water -= 250;
                            milk -= 0;
                            beans -= 16;
                            money += 4;
                            cups -= 1;
                            System.out.println("I have enough resources, making you an espresso!");
                        }
                        break;
                    case 2:
                        if (water < 350) {
                            System.out.println("Sorry, not enough water!");
                        } else if (milk < 75) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (beans < 20) {
                            System.out.println("Sorry, not enough coffee beans!");
                        } else if (money < 7) {
                            System.out.println("Sorry, not enough money!");
                        } else {
                            water -= 350;
                            milk -= 75;
                            beans -= 20;
                            money += 7;
                            cups -= 1;
                        }
                        System.out.println("I have enough resources, making you a latte!");
                        break;
                    case 3:
                        if (water < 200) {
                            System.out.println("Sorry, not enough water");
                        } else if (milk < 100) {
                            System.out.println("Sorry, not enough milk");
                        } else if (beans < 12) {
                            System.out.println("Sorry, not enough coffee beans");
                        } else if (money < 6) {
                            System.out.println("Sorry, not enough money");
                        } else {
                            water -= 200;
                            milk -= 100;
                            beans -= 12;
                            money += 6;
                            cups -= 1;
                            System.out.println("I have enough resources, making you a cappuccino!!");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                }

            } else if (answer.equals("fill")) {
                System.out.println("Write how many ml of water you want to add: ");
                int addW = scan.nextInt();
                System.out.println("Write how many ml of milk you want to add: ");
                int addM = scan.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add: ");
                int addCB = scan.nextInt();
                System.out.println("Write how many disposable cups you want to add: ");
                int addCP = scan.nextInt();
                //so i remember i need to add a switch again here I think. Add a formula like I subtracted above
                water += addW;
                milk += addM;
                beans += addCB;
                cups += addCP;

            } else if (answer.equals("take")) {
                money = 0;
                System.out.println("I gave you $" + money);

            } else if (answer.equals("remaining")) {
                System.out.println("The coffee machine has: ");
                System.out.println(water + " ml of water");
                System.out.println(milk + " ml of milk");
                System.out.println(beans + " g of coffee beans");
                System.out.println(cups + " disposable cups");
                System.out.println("$" + money + " of money");
            } else if (answer.equals("exit")) {
                break;
            }
        }
    }
}

