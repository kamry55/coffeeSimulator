package machine;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CoffeeMachine {
    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;

    public CoffeeMachine(int water, int milk, int beans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
    }

    public void printStatus() {
        System.out.println("The coffee machine has: ");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public void fill(int water, int milk, int beans, int cups) {
        this.water += water;
        this.milk += milk;
        this.beans += beans;
        this.cups += cups;
    }

    public void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public void buy(String choice) {
        switch (choice) {
            case "1":
                makeCoffee(250, 0, 16, 4, "espresso");
                break;
            case "2":
                makeCoffee(350, 75, 20, 7, "latte");
                break;
            case "3":
                makeCoffee(200, 100, 12, 6, "cappuccino");
                break;
            case "back":
                System.out.println("Returning to main menu");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    private void makeCoffee(int water, int milk, int beans, int price, String type) {
        if (this.water < water) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milk < milk) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.beans < beans) {
            System.out.println("Sorry, not enough beans!");
        } else if (this.cups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else {
            this.water -= water;
            this.milk -= milk;
            this.beans -= beans;
            this.money += price;
            this.cups -= 1;
            System.out.println("I have enough resources, making you a " + type + "!");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CoffeeMachine machine = new CoffeeMachine(400, 540, 120, 9, 550);


        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit)");

            String answer = scan.next();
            if (answer.equals("buy")) {
                System.out.println("What do you want to buy? 1- espresso, 2- latte, 3- cappuccino, back- to main menu");
                String choice = scan.next();
                machine.buy(choice);
            } else if (answer.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                int addWater = scan.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                int addMilk = scan.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                int addBeans = scan.nextInt();
                System.out.println("Write how many disposable cups you want to add:");
                int addCups = scan.nextInt();
                machine.fill(addWater, addMilk, addBeans, addCups);
            } else if (answer.equals("take")) {
                machine.take();
            } else if (answer.equals("remaining")) {
                machine.printStatus();
            } else if (answer.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid action");
            }
        }
    }
}