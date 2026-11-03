package com.zia.exception;

import java.util.Scanner;

public class PrimeNumberList{

    public static void printPrimeNumberList(int a){

        System.out.println("Prime numbers up to " + a + " are:");

        for (int i = 2; i <= a; i++) {//i=5

            int count = 0;

            for (int j = 1;  j<= i; j++) {//j=4

                if (i % j == 0) {
                    count++;//3
                }
            }

            if (count == 2) {
                System.out.print(i + " ");
            }
        }

    }

        public static void main(String[] args) {
            System.out.print("Enter any number to get list of prime numbers till the entered number: ");

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();//n=5

            printPrimeNumberList(n);
            sc.close();
        }

}
