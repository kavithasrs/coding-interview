package com.practice.codinginterview.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "kavitha";
        System.out.println("The passed in string is " + (isStringHasUniqueCharacters(str) ? "unique" : "not unique"));
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
}
