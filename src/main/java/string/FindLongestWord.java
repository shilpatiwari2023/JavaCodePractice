package src.main.java.string;

public class FindLongestWord {
    public static void main(String[] args) {
        String str = "Java and Selenium";
        String longest = "";
        String[] words = str.split("\\s+");
        System.out.println("Total number of words: " + words.length);
        for(String word : words){
            if(word.length() > longest.length()){
                longest = word;
            }
        }
        System.out.println("Longest word : " + longest);
    }
}
