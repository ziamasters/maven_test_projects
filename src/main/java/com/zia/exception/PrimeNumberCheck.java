package com.zia.exception;

import java.util.Scanner;


public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println("Enter any number to check whether it is prime or not");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        boolean isPrime = true;
        if (a <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;

                }
            }
        }
        if (isPrime) {
            System.out.println(a + " is a Prime Number");
        } else {

            System.out.println(a + " is not a Prime Number");

        }


    }
}
