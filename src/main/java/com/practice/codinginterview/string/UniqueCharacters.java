package com.practice.codinginterview.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class UniqueCharacters {

    public static void main(String[] args) {
    String input = "kkkkkkaavvrrrtt";
       // System.out.println("The string is " + (isStringHasUniqueCharacters(input) ? "is unique" : "not unique"));
        //countDuplicateCharacters(input);
        //countDuplicateCharactersUsingStreams(input);
        countDuplicateCharactersUsingMap(input);
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

    public static void countDuplicateCharactersUsingStreams(String input){

        Map<Character, Long> result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(result);

    }

    public static void countDuplicateCharactersUsingMap(String str){
        Map<Character, Integer> result = new HashMap<>();
        for(char ch: str.toCharArray())  {
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        System.out.println(result);
    }

}


