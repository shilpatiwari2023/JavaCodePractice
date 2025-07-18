package src.main.java.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        // Create LinkedHashSet to remove duplicates and preserve order
        Set<Integer> uniqueSet = new LinkedHashSet<>();

        // Add array elements to set
        for (int num : arr) {
            uniqueSet.add(num);
        }

        // Print result
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueSet) {
            System.out.print(num + " ");
        }
    }
}
