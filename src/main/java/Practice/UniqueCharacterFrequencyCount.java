package src.main.java.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacterFrequencyCount {
    public static void main(String[] args) {
        String a = "rtrrutwe";

        // Map to store frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : a.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Collect characters with frequency = 1
        List<Character> uniqueChars = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueChars.add(entry.getKey());
            }
        }

        System.out.println("Unique Characters = " + uniqueChars);
    }

}
