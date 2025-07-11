package src.main.java.july2ndweek;

//Java String Program to Replace a Character at a Specific Index
public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        String str = "GEEKs FOR GEEKS";
        int index = 4;
        char ch = 'S';
        System.out.println("Original string is : " + str);
        str = str.substring(0,index) + ch + str.substring(index+1);
        System.out.println("Modified string is : " + str);
    }
}
