package src.main.java.Practice;

public class FindVowelInString {
    public static void main(String[] args) {
        String s = "Shilpa";
        s = s.toLowerCase();
        System.out.println("Input String : " + s);
        char[] input = s.toCharArray();
        String vowels = "";
        String consonants = "";
        for(char ch : input){
            if(ch == 'a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
                vowels = vowels + ch;
                vowels = vowels + ',';
            }else {
               consonants = consonants + ch;
               consonants = consonants + ',';
            }
        }
        System.out.println("Vowels in Input string are : " + vowels);
        System.out.println("Consonants in Input String are : " + consonants);
    }
}
