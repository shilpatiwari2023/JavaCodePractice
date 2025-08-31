package src.main.java.Practice;

import java.util.HashMap;
import java.util.Map;

public class PrintOnlyUniqueElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 4, 7};

        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print elements that appear exactly once
        for (int num : arr) {
            if (freqMap.get(num) == 1) {
                System.out.println(num);
            }
        }
    }

}
