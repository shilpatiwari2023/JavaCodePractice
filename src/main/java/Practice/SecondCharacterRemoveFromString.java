package src.main.java.Practice;

public class SecondCharacterRemoveFromString {
    public static void main(String[] args) {
        String str = "My name is Shilpa";
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            if(word.length()>1){
                sb.append(word.charAt(0));
                sb.append(word.substring(2));
            }else {
                sb.append(word);
            }
            sb.append(" ");
        }
        System.out.println("Original string : " + str);
        System.out.println("Result is : " + sb.toString());
    }

}
