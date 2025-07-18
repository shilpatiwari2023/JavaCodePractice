package src.main.java.java8feature;

@java.lang.FunctionalInterface
interface Calculator {
    int operate(int a, int b);
    //int music(int a, int b);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println(add.operate(10, 20)); // 30

        Calculator sub = (a, b) -> a - b;
        System.out.println( sub.operate( 20, 10));
    }
}
