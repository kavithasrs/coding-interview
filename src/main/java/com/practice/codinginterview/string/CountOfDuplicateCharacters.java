package com.practice.codinginterview.string;

import java.util.HashMap;
import java.util.Map;

public class CountOfDuplicateCharacters {
    public static void main(String[] args) {

        printCharacterCount("sdfbmfbsdmfbmfsbgm");

    }

    public static boolean printCharacterCount(String s){
        boolean b = true;
        Map<Character, Integer> charMap = new HashMap<>();
        for(char ch : s.toCharArray()){

            //if adding the key for the first time set the count as 1, else set the count to existing value
            int count = (charMap.get(ch) == null) ? 1 : charMap.get(ch);//  1, 1, 2

            //System.out.println("key: " + ch + " value: " + charMap.get(ch));
            //if it already contains that key increment the count
            if (charMap.containsKey(ch)) { // false true  true
                count++;                   //        2    3
            }
            // adding the key to the map with the value as count
            charMap.put(ch,count); // k-1, k-2, k-3

        }
        charMap.forEach((k,v) -> {
            if (v >1)
                System.out.println(k + " occurs " + v + "times");
        });
        return b;
    }
}
