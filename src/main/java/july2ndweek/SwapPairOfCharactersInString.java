package src.main.java.july2ndweek;

//Swapping Pairs of Characters in a String in Java
public class SwapPairOfCharactersInString {
    public static void main(String[] args) {
        String str = "Shilpa";
        System.out.println(str);
        System.out.println(swapCharacter(str));
    }

    private static String swapCharacter(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("As str is empty so can't swap characters");
        }
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length-1; i = i+2) {
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }
        return new String(ch);
    }
}

