package src.main.java.string;

public class StringFunctionsDemo {
    public static void main(String[] args) {
        String str = " Hello Java Programming ";

        // length()
        System.out.println("Length: " + str.length());

        // trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // toUpperCase() and toLowerCase()
        System.out.println("Upper Case: " + str.toUpperCase());
        System.out.println("Lower Case: " + str.toLowerCase());

        // charAt()
        System.out.println("Character at index 8: " + str.charAt(8));

        // substring()
        System.out.println("Substring (7 to 11): " + str.substring(7, 11));

        // contains()
        System.out.println("Contains 'Java'? " + str.contains("Java"));

        // replace()
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // indexOf() and lastIndexOf()
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));

        // startsWith() and endsWith()
        System.out.println("Starts with ' H'? " + str.startsWith(" H"));
        System.out.println("Ends with 'g '? " + str.endsWith("g "));

        // equals() and equalsIgnoreCase()
        String another = " hello java programming ";
        System.out.println("Equals: " + str.equals(another));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(another.trim()));

        // split()
        String[] words = str.trim().split(" ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
