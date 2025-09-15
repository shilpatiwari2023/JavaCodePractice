package src.main.java.leetcode;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "hello world";
        String result = reverseVowels(s);
        System.out.println("Original: " + s);
        System.out.println("Processed: " + result);
    }

    public static String reverseVowels(String s) {
        if (s == null || s.length() == 0) return s;

        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (!isVowel(chars[left])) {
                left++;
            } else if (!isVowel(chars[right])) {
                right--;
            } else {
                // swap vowels
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
