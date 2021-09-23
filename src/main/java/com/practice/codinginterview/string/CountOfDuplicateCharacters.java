package com.practice.codinginterview.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfDuplicateCharacters {
    public static void main(String[] args) {

        printCharacterCount("key key west west east is west north is best");

    }

    public static void printCharacterCount(String s) {

        Map<String, Integer> charMap = new HashMap<>();

        for (String word : s.split(" ")) {

            int count = 0;
            if(charMap.get(word) == null){
                count = 1;
            } else count = charMap.get(word);

            if(charMap.containsKey(word)){
                count++;
            }

            charMap.put(word, count);

            }
        charMap.forEach((k,v) -> {
            if(v>1) System.out.println(k + " occurs " + v + " times");
        });
        }



    }