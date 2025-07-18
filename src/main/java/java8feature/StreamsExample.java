package src.main.java.java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);


        List<Integer> evens = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evens); // [2, 4, 6]

    }
}
