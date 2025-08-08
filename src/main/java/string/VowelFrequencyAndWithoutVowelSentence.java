package src.main.java.string;

import java.lang.classfile.instruction.SwitchCase;

public class VowelFrequencyAndWithoutVowelSentence {
    public static void main(String[] args) {
        String sentence = "Click on RUN button to see the output";
        sentence = sentence.toLowerCase();
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;
        String result = "";
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            switch (Character.toLowerCase(ch)) {
                case 'a':
                    aCount = aCount + 1;
                    break;
                case 'e':
                    eCount = eCount + 1;
                    break;
                case 'i':
                    iCount = iCount + 1;
                    break;
                case 'o':
                    oCount = oCount + 1;
                    break;
                case 'u':
                    uCount = uCount + 1;
                    break;
                default:
                    result = result + ch;

            }
        }
        System.out.println("Original Sentence : " + sentence);
        System.out.println("Without Vowels    : " + result);
        System.out.println("Vowel Frequencies:");
        System.out.println("a: " + aCount);
        System.out.println("e: " + eCount);
        System.out.println("i: " + iCount);
        System.out.println("o: " + oCount);
        System.out.println("u: " + uCount);
    }
}

