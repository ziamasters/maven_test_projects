package com.zia.exception;

import java.util.Optional;

public class WithOptionalClass {
    public static void main(String[] args) {
        String s1[]  = new String[10];
        s1[5]="Hello";
        Optional<String>  checknull = Optional.ofNullable(s1[5]);
        if(checknull.isPresent()){
            String word = s1[5].toUpperCase();
            System.out.println(word);

        }
        else
            System.out.println("words  is null");


    }
}
