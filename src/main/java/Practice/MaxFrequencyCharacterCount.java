package src.main.java.Practice;

import java.util.*;

public class MaxFrequencyCharacterCount {
    public static void main(String[] args) {
        String a = "altimetrikaat";

        // Map to store frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : a.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Find maximum frequency
        int maxFreq = Collections.max(freqMap.values());

        // Collect characters with maximum frequency
        List<Character> maxChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                maxChars.add(entry.getKey());
            }
        }

        System.out.println("Max Frequency Characters = " + maxChars + " (Frequency = " + maxFreq + ")");
    }

}
