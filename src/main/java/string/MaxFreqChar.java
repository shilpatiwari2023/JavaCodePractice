package src.main.java.string;

import java.util.*;

public class MaxFreqChar {
    public static void main(String[] args) {
        String s = "altimetrikaat";

        // LinkedHashMap to preserve order
        Map<Character, Integer> freq = new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            } else {
                freq.put(c, 1);
            }
        }

        // Find max frequency
        int max = 0;
        for (int val : freq.values()) {
            if (val > max) {
                max = val;
            }
        }

        // Print all characters with max frequency
        boolean first = true;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == max) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(entry.getKey() + " - " + entry.getValue());
                first = false;
            }
        }
    }
}



