package src.main.java.java8feature;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionExmaple {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("EY", "Infosys", "TCS");
        for(String o:names) {
            System.out.println(o);
        }

        names.forEach(i -> System.out.println(i));
    }
}
