package src.main.java.Practice;

public class ReverseAndSmallLetterChange {
    public static void main(String[] args) {
        String str = "Where Are You";
        str = str.toLowerCase();
        System.out.println(str);
        char[] ch = str.toCharArray();
        for(int i = ch.length-1; i >= 0; i--){
            System.out.print(ch[i]);
        }
    }
}