package src.main.java;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {10,15,20,50,6};
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        System.out.println("Largest element is : " + max);

    }
}
