package src.main.java.Practice;

public class RemoveIntegerDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 30, 40, 40, 60, 60};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    // Shift left to remove arr[j]
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--;     // Reduce array size
                    j--;     // Recheck current position
                }
            }
        }

        // Print unique elements
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
