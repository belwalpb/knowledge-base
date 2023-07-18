package com.company.mvcapp;

import java.util.HashMap;
import java.util.Map;

public class MyClass {

    public static void main(String[] args) {
        String str = "testsample";

        char[] ch = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i<ch.length;i++) {
            if(map.containsKey(ch[i])) {
                // Get the current value from map, add 1 then set again in map
                map.put(ch[i], map.get(ch[i])+1);
            }
            else {
                map.put(ch[i], 1);
            }
        }

        int maxFreq = Integer.MIN_VALUE;
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.println("Key is: "+ entry.getKey() + " Value is: "+ entry.getValue());

            if(entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
            }
        }

       System.out.println(maxFreq);
    }
}
