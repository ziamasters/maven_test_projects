package com.zia.exception;

public class MethodOverloading {
    public void getSum(){
        int a,b,c;
        a=45;
        b=65;
        c=a+b;
        System.out.println(c+"is the sum of "+a+" & +b ");
    }
    public void getSum(int a, int b){
        int c;
        c=a+b;
        System.out.println(c+"is the sum of "+a+" & +b");


    }

    public static void main(String[] args) {
        MethodOverloading ans = new MethodOverloading();
        ans.getSum();

    }
}
