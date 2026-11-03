package com.zia.interfaces;

public class CoffeeShopOrder {

    public static void main(String[] args) {

        // Number of items
        int coffees = 2;
        int teas = 1;
        int pastries = 3;

        // Prices
        double coffeePrice = 3.50;
        double teaPrice = 2.75;
        double pastryPrice = 2.17;

        // Tax rate
        double taxRate = 0.07;

        // Calculate subtotal
        double subtotal = (coffees * coffeePrice)
                + (teas * teaPrice)
                + (pastries * pastryPrice);

        // Calculate tax
        double tax = subtotal * taxRate;

        // Calculate total
        double total = subtotal + tax;

        // Display results
        System.out.println("Coffees: " + coffees);
        System.out.println("Teas: " + teas);
        System.out.println("Pastries: " + pastries);

        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));

        // Comparison operator
        if (total > 15) {
            System.out.println("You qualify for a free drink!");
        } else {
            System.out.println("Add more items to qualify for a free drink!");
        }
    }
}


