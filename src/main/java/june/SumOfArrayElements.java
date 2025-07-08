package src.main.java.june;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum is : " + sum);
    }
}
