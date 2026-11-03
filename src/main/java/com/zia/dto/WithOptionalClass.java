package com.zia.dto;

import java.util.Optional;

public class WithOptionalClass {
        // Main Method
        public static void main(String[] args){
            String[] words = new String[10];
            words[5]= "welcome";
          // this is the optional class
            Optional<String> checkNull = Optional.ofNullable(words[5]);

            if (checkNull.isPresent()) {
                String word = words[5].toUpperCase();
                System.out.print(word);
            }
            else
                System.out.println("word is null");
        }
    }

