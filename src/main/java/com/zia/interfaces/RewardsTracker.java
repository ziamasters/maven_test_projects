package com.layaq.interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RewardsTracker {

    public static void main(String[] args) {

        // Purchase categories
        String[] categories = {
                "GROCERY",
                "DINING",
                "TRAVEL",
                "GAS",
                "OTHER",
                "GROCERY"
        };

        // Transaction amounts
        double[] amounts = {
                125.50,
                85.75,
                210.25,
                75.35,
                90.00,
                100.00
        };

        // Promotional code
        String promoCode = "BONUS10";

        // Calculate total spending using a for loop
        double totalSpending = 0.0;

        for (int i = 0; i < amounts.length; i++) {
            totalSpending += amounts[i];
        }

        // Round total spending to two decimal places
        totalSpending = Math.round(totalSpending * 100.0) / 100.0;

        // Determine reward tier
        String tier;
        int multiplier;

        if (totalSpending >= 500) {
            tier = "Platinum";
            multiplier = 3;
        } else if (totalSpending >= 250) {
            tier = "Gold";
            multiplier = 2;
        } else {
            tier = "Silver";
            multiplier = 1;
        }

        // Calculate base points
        int basePoints = (int) Math.round(totalSpending * multiplier);

        // Determine promotional bonus
        double bonusRate;

        switch (promoCode) {
            case "BONUS10":
                bonusRate = 0.10;
                break;

            case "TRAVEL5":
                bonusRate = 0.05;
                break;

            default:
                bonusRate = 0.00;
                break;
        }

        // Calculate bonus points
        int bonusPoints = (int) Math.round(basePoints * bonusRate);

        // Calculate total points
        int totalPoints = basePoints + bonusPoints;

        // String equality demonstration
        // == compares references, while .equals() compares String contents.
        System.out.println("Equality demo:");
        System.out.println(promoCode == "BONUS10");
        System.out.println(promoCode.equals("BONUS10"));
        System.out.println();

        // While loop
        int count = 0;

        while (count < 3) {
            System.out.println("Calculating rewards...");
            count++;
        }

        System.out.println();

        // Current date
        LocalDate currentDate = LocalDate.now();

        // Next billing date is 30 days later
        LocalDate nextBillingDate = currentDate.plusDays(30);

        // Date format
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String formattedCurrentDate = currentDate.format(formatter);
        String formattedBillingDate = nextBillingDate.format(formatter);

        // Professional output
        System.out.println("=== CreditCardPro Monthly Summary ===");
        System.out.println("Date: " + formattedCurrentDate);
        System.out.println("Next Billing: " + formattedBillingDate);
        System.out.println("------------------------------");
        System.out.printf("Total Spending: $%.2f%n", totalSpending);
        System.out.println("Tier: " + tier + " (x" + multiplier + " points)");
        System.out.println("Base Points: " + basePoints);
        System.out.println("Bonus Points Applied: " + bonusPoints);
        System.out.println("Total Points Earned: " + totalPoints);
        System.out.println("Promo Code: " + promoCode);
        System.out.println("Message: Great work! Keep building your rewards.");
    }
}



