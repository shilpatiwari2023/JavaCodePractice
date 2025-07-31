package src.main.java.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//java 8 and above, we can use String.join
public class ConvertListOfStringIntoCommaSeparatedString {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry");

        String result = String.join(",", items);

        System.out.println(result);  // Output: apple,banana,cherry

        //For same program, we can use Streams
        List<String> items1 = Arrays.asList("apple", "banana", "cherry");

        String result1 = items.stream()
                .collect(Collectors.joining(","));

        System.out.println(result1);  // Output: apple,banana,cherry

        //Normal way of implementation - older version of java 8
        List<String> items2 = Arrays.asList("apple", "banana", "cherry");

        StringBuilder result2 = new StringBuilder();
        for (int i = 0; i < items2.size(); i++) {
            result2.append(items.get(i));
            if (i < items.size() - 1) {
                result2.append(",");
            }
        }

        System.out.println(result.toString());  // Output: apple,banana,cherry

    }
}
