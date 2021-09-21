package com.practice.codinginterview.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "kavitha";
        //System.out.println("The passed in string is " + (isStringHasUniqueCharacters(str) ? "unique" : "not unique"));
        printCharacterCount("kavithagujalambal");
    }
    /**
     * Map.put(k,v)
     * @return the previous value associated with {@code key}, or
     *         {@code null} if there was no mapping for {@code key}.
     *         (A {@code null} return can also indicate that the map
     *         previously associated {@code null} with {@code key},
     *         if the implementation supports {@code null} values.)
     */
    public static boolean isStringHasUniqueCharacters(String s){
        boolean b = true;
        Map<Character, Integer> charMap = new HashMap<>();
        for(char ch : s.toCharArray()){
            System.out.println("key: " + ch + " value: " + charMap.get(ch));
            if(charMap.put(ch,1)!=null) {
                return false;
            }
        }
        return b;
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
