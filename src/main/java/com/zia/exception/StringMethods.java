package com.zia.exception;

public class StringMethods {
    public static void main(String[] args) {
        String originalString = "WORLD";
        String reversedString = "";
        System.out.println("OriginalString :" + originalString);
        for(int i=0; i<originalString.length(); i++){
            reversedString=originalString.charAt(i)+reversedString;

        }
        System.out.println("ReversedString :"+ reversedString);



        System.out.println(reversedString.toUpperCase());
        System.out.println(reversedString.toLowerCase());
        System.out.println(reversedString.contains("rld"));
    }
}

