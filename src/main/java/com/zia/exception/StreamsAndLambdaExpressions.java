package com.zia.exception;

import com.zia.interfaces.OddNumberFunctionalInterface;

import java.util.Scanner;

public class StreamsAndLambdaExpressions {

    public static void main(String[] args) {
        System.out.println("Enter any integer number to check the whether it is even or odd");
        Scanner s  = new Scanner(System.in);
        int j  =  s.nextInt();

        OddNumberFunctionalInterface result = (n) -> {

            if (n % 2 == 1) {

                System.out.println("This is odd  number");
            } else {
                System.out.println("This is even  number");
            }
        };
        result.getOdd(j);

    }
}




