package com.practice.codinginterview.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UniqueCharacters {

    public static void main(String[] args) {
    String input = "kkkkkk";

        System.out.println("The string is " + (isStringHasUniqueCharacters(input) ? "is unique" : "not unique"));

        countDuplicateCharacters(input);

    }


    public static boolean isStringHasUniqueCharacters(String input){
        boolean isUnique = true;

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for(char ch : input.toCharArray()){

            if(characterIntegerMap.get(ch) != null) {
                System.out.println("key " + ch + " value " + characterIntegerMap.get(ch));
            }

            if(characterIntegerMap.put(ch, 1) != null){
                return false;
            }
        }

        return isUnique;
    }

    public static void countDuplicateCharacters(String input){

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for(char ch : input.toCharArray()) {
            int count = (characterIntegerMap.get(ch) == null) ? 1 : characterIntegerMap.get(ch);

            if (characterIntegerMap.containsKey(ch)) {
                count++;
            }

            characterIntegerMap.put(ch, count);

        }

                characterIntegerMap.forEach((k,v) -> {
                    if (v > 1)
                        System.out.println(k + " occurs " + v + " times");
                });



    }

}


