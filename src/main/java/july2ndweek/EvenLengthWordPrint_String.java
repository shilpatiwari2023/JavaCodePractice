package src.main.java.july2ndweek;
//Java String Program to Print Even-Length Words like do, am, like
public class EvenLengthWordPrint_String {
    public static void main(String[] args) {
        String s = "i am Geeks for Geeks and a Geek";
        printWords(s);
    }

    public static void printWords(String s) {
        for (String w : s.split(" ")) {
            // if length is even
            //System.out.println(w);
            if (w.length() % 2 == 0) {
                System.out.println(w);
            }
        }
    }
}