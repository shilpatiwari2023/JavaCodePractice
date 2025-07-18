package src.main.java.string;

public class FirstNonRepetetiveCharacter {
    public static void main(String[] args) {
        String input = "automation";
        for (char ch : input.toCharArray()) {
            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
    }
}
