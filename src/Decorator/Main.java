package Decorator;

import Decorator.Ingredients.*;

public class Main {

    public static void main(String[] args) {

        buildMenu();

    }

    public static void buildMenu() {
        System.out.println("Pizza menu\n");
        buildRomeo();
        buildJulia();
        buildChickenBBQ();
        buildMargarita();
        buildWuhanSpecial();
    }

    public static void buildJulia() {
        Fill pizza = new BlueCheese(new Shrimp( new Pineapple( new Ham(new Base()))));

        System.out.println("Julia Pizza:");
        System.out.println(pizza.getDescription());
        System.out.println("Price: " + pizza.getPrice());
        System.out.println();
    }

    public static void buildRomeo() {
        Fill pizza = new BlueCheese(new Shrimp(new Pineapple( new Salami(new Base()))));

        System.out.println("Romeo Pizza:");
        System.out.println(pizza.getDescription());
        System.out.println("Price: " + pizza.getPrice());
        System.out.println();
    }

    public static void buildChickenBBQ() {
        Fill pizza = new BBQSauce(new RedOnion(new Bacon(new Chicken(new Base()))));

        System.out.println("Chicken BBQ Pizza:");
        System.out.println(pizza.getDescription());
        System.out.println("Price: " + pizza.getPrice());
        System.out.println();
    }

    public static void buildMargarita() {
        Fill pizza = new Cheese(new Cheese(new Cheese(new Cheese(new Base()))));

        System.out.println("Pizza Margarita:");
        System.out.println(pizza.getDescription());
        System.out.println("Price: " + pizza.getPrice());
        System.out.println();
    }

    public static void buildWuhanSpecial() {
        Fill pizza = new Bat(new BlueCheese(new Cheese(new RedOnion(new Base()))));

        System.out.println("Wuhan Special:");
        System.out.println(pizza.getDescription());
        System.out.println("Price: " + pizza.getPrice());
        System.out.println();

    }
}
