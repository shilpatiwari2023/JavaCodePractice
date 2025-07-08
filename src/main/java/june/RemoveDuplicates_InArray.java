package src.main.java.june;

import java.util.Arrays;

public class RemoveDuplicates_InArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 5, 2, 2, 6};
        int n = arr.length;

        int[] temp = new int[n];
        int newIndex = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] is already in temp[]
            for (int j = 0; j < newIndex; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add to temp[]
            if (!isDuplicate) {
                temp[newIndex] = arr[i];
                newIndex++;
            }
        }

        // Create final array with exact size
        int[] result = new int[newIndex];
        for (int i = 0; i < newIndex; i++) {
            result[i] = temp[i];
        }

        // Print result
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}




