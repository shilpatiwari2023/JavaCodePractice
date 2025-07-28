package src.main.java.string;

public class SortWithoutSortFunction {
    public static void main(String[] args) {
        int[] arr = {-10, 2, -1};
        int[] sorted = new int[arr.length];

        // Start with first element
        sorted[0] = arr[0];
        int size = 1;

        for (int i = 1; i < arr.length; i++) {
            int j = size - 1;

            // Find correct position to insert arr[i]
            while (j >= 0 && sorted[j] > arr[i]) {
                sorted[j + 1] = sorted[j];  // shift right
                j--;
            }

            // Insert current element
            sorted[j + 1] = arr[i];
            size++;
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
