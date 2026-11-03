package com.zia.exception;

import java.util.Scanner;

public class LogicalNumbers {
    public void getLogic() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer number to see its even number till the entered number");
        int j = s.nextInt();
        for (int i = 1; i <= j; i++) {
            if (i % 2 == 0) {
                System.out.println("FIZZ");
            } else {
                System.out.println(i);
            }
        }
        }

        public static void main(String args[]){
            LogicalNumbers Ln = new LogicalNumbers();
            Ln.getLogic();

        }

    }

