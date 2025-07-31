package src.main.java.string;

public class RemoveDuplicateWithoutStringBuilder {
    public static void main(String[] args) {
        String input = "automation";
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (output.indexOf(c) == -1) {
                output = output + c;
            }
        }
        System.out.println(output);
    }
}
