package com.zia.exception;

public class MinMax {
    public static void main(String[] args) {
        int num[] = {54, 10, 201, 9, 15,67,43,2,89};
        int min = num[0];
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {//true
                min = num[i];// min = 5
            }
            if (num[i] > max) {//false
                max = num[i];
            }
        }
        System.out.println("Minimum number of array is :"+min);
        System.out.println("Maximum number of array is :"+max);
    }

}

