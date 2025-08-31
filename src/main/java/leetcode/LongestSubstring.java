package src.main.java.leetcode;

import java.util.*;

/**
 * Given a string s, find the length of the longest substring without duplicate characters.
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and space
 */

public class LongestSubstring {
    public static void main(String[] args) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter String - ");
        String input = scanner.nextLine();
        for(char ch : input.toCharArray()){
        map.put(ch, map.getOrDefault(ch,0)+1);
        }
        List<Character> list = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println(list);
        System.out.println("Size of longest substring is : " + list.size());
    }


}
