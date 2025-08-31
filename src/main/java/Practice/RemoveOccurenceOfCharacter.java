package src.main.java.Practice;
//Remove all occurrences of a specified value in a given array, return the new length[Input:a ={2,2,3,4,2,6,8}
// Remove all occurences of 2 Output: Length after removing :4
public class RemoveOccurenceOfCharacter {
    public static void main(String[] args) {
        int[] a = {2, 2, 3, 4, 2, 6, 8};
        int val = 2; // value to remove

        int newLength = removeOccurrences(a, val);

        System.out.println("Length after removing: " + newLength);
        System.out.print("Array after removing: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static int removeOccurrences(int[] arr, int val) {
        int index = 0; // pointer for new array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}


