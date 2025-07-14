package src.main.java.string;

public class SwapWordsInString {
    public static void main(String[] args) {
        String str = "I love java and selenium";
        String part1 = "java and selenium";
        String part2 = "selenium and java";
        String result = str.replace(part1,part2);
        System.out.println("Original string is : " + str);
        System.out.println("New string is : " + result);
    }
}
