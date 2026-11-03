package com.zia.interfaces;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(" The below numbers are Fibonacci series");
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        int n = 20;
        int a = 0 , b = 1 ;
        System.out.println(a+""+b+"");
        for(int i = 2 ; i < n ; i++){
            int c = a+b;
            System.out.println(c+"");
            a = b ;
            b = c ;

        }
    }
}
