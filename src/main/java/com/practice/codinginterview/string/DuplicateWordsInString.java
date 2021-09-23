package com.practice.codinginterview.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInString {

    public static void main(String[] args) {
        String input = "west key east meets west key west";

        countDuplicateWords(input);
    }

    public static void countDuplicateWords(String input){

        Map<String, Integer> stringIntegerHashMap = new HashMap<>();

        for(String word : input.split(" ")){
            int count = stringIntegerHashMap.get(word) == null ? 1 : stringIntegerHashMap.get(word);

            if(stringIntegerHashMap.containsKey(word)){
                count++;
            }

            stringIntegerHashMap.put(word, count);
        }
        stringIntegerHashMap.forEach((word, count) -> {if(count > 1) System.out.println("word " + word + " occurs " + count + " times");});
    }
}
