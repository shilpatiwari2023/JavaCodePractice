package src.main.java.july2ndweek;

//Java String Program to Insert a String into Another String
public class StringWithinString {
    public static void main(String[] args) {
        // Get the Strings
        String originalString = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 4;
        System.out.println("Original String: " + originalString);
        System.out.println("String to be inserted: " + stringToBeInserted);
        System.out.println("String to be inserted at index: " + index);
        // Insert the String
        System.out.println("Modified String: " + insertString(originalString, stringToBeInserted, index));
    }

    public static String insertString(String originalString, String stringToBeInserted, int index) {
        // Create a new string
        String newString = new String();

        for (int i = 0; i < originalString.length(); i++) {
            // Insert the original string character
            // into the new string
            newString = newString + originalString.charAt(i);
            if (i == index) {
                // Insert the string to be inserted
                // into the new string
                newString = newString + stringToBeInserted;
            }
        }
        // return the modified String
        return newString;
    }

}
