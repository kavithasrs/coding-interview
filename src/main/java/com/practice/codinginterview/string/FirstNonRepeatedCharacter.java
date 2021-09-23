package com.practice.codinginterview.string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        //find("sssaaapk");
        findUsingLambda("sssaaapkhgfe");
    }

    static void find(String str) {

        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charMap.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        System.out.println(charMap);
        System.out.println(charMap.keySet());
        System.out.println(charMap.values());

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() == 1)
                System.out.println("The first non repeated char is " + entry.getKey());
            break;

        }


    }

    static void findUsingLambda(String str) {

        Map<Character, Integer> charMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charMap.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        System.out.println(charMap.entrySet()
                .stream()
                .filter(e -> e.getValue()==1)
                .collect(Collectors.toSet()));
    }
}
