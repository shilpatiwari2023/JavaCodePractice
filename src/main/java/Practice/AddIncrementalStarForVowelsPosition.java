package src.main.java.Practice;

public class AddIncrementalStarForVowelsPosition {
    public static void main(String[] args) {
        String input = "ENCHALEPIDEA";
        String output = replaceVowelsWithStars(input);
        System.out.println(output);  // *NCH*L**P***D****
    }

    private static String replaceVowelsWithStars(String s) {
        String result = "";
        int vowelCount = 0;
        int len = s.length();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i != 0 && i != len-1 && isVowel(ch)) {
                    vowelCount++;
                    // add stars equal to vowel count
                    for (int j = 0; j < vowelCount; j++) {
                        result = result + "*";
                    }
            } else {
                result = result + ch;
            }
        }
        return result;

    }
    // helper method to check vowels (both upper and lower case)
    public static boolean isVowel(char c) {
        boolean isVowel = false ;

        if("AEIOUaeiou".indexOf(c) != -1) {
            isVowel = true;
        }
        return isVowel;
        //return "AEIOUaeiou".indexOf(c) != -1;
    }
    // and or
    // if ( (a == abc && a = xyz ) || ())
}
