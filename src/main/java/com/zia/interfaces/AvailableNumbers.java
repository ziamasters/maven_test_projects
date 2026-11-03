package com.zia.interfaces;

import java.util.Scanner;

public class AvailableNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number to know the which number is available ot not available");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = {45, 56, 78, 90, 105};
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) {
                counter++;
            }

        }
        if (counter == 1 || counter == 2) {
            System.out.println("The entered value is available in the array");

        } else {
            System.out.println("entered number is not available in array ");
        }
    }
}
