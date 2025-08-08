package src.main.java.string;

public class PlaceReversedCapitalized {
    public static void main(String[] args) {
        String input = "india is great";
        String result = "";
        String[] words = input.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            if (!word.isEmpty()){
                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                result = result + capitalized + " ";
            }
        }
        System.out.println(result);
    }
}
