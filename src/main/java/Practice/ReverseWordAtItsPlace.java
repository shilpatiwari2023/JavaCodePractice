package src.main.java.Practice;

public class ReverseWordAtItsPlace {
    public static void main(String[] args) {
        String str = "shilpa Tiwari";
        String[] words = str.split(" ");
        String result = "";
        for(String word : words){
            for(int i = word.length()-1;i>=0;i--){
                result = result + word.charAt(i);
            }
            result = result + " ";
        }
        System.out.println(result);
    }
}
