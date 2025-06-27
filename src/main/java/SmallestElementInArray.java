package src.main.java;

public class SmallestElementInArray {

    public static void main(String[] args) {
        int[] arr = {10,15,20,50,6};
        System.out.println("Smallest element is : " + smallestInArray(arr));
    }

    public static int smallestInArray(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }

        }
        return min;
    }
}
