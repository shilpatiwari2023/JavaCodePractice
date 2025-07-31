package src.main.java.string;

public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "My name is Shilpa";
        String reversed = "";
        String final_input = "";
        String[] words = input.split(" ");
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }
            reversed = reversed + " ";
        }
        final_input = final_input + reversed + " ";
        final_input = final_input.trim();
        System.out.println(reversed);
        System.out.println("Final reversed word is : " + final_input);
    }

}

