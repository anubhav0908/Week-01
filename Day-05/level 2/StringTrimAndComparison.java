import java.util.Scanner;

public class StringTrimAndComparison {

    // Method to trim leading and trailing spaces using charAt() method
    public static int[] trimSpacesUsingCharAt(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end };
    }

    // Method to create a substring using charAt() method with start and end indices
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        
        // Create the substring using charAt() method
        for (int i = start; i <= end; i++) {
            substring.append(text.charAt(i));
        }

        return substring.toString();
    }

    // Method to compare two strings using charAt() method and return a boolean result
    public static boolean compareStringsUsingCharAt(String text1, String text2) {
        int length1 = text1.length();
        int length2 = text2.length();

        // Check if lengths are different
        if (length1 != length2) {
            return false;
        }

        // Compare each character using charAt() method
        for (int i = 0; i < length1; i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }

        return true; // Strings are the same
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take the input string from the user
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Trim leading and trailing spaces using charAt()
        int[] trimmedIndices = trimSpacesUsingCharAt(inputText);
        String trimmedTextUsingCharAt = createSubstringUsingCharAt(inputText, trimmedIndices[0], trimmedIndices[1]);

        // Trim leading and trailing spaces using the built-in trim() method
        String trimmedTextBuiltIn = inputText.trim();

        // Compare the two results
        boolean isEqual = compareStringsUsingCharAt(trimmedTextUsingCharAt, trimmedTextBuiltIn);

        // Display the results
        System.out.println("Text after trimming using charAt(): " + trimmedTextUsingCharAt);
        System.out.println("Text after trimming using trim(): " + trimmedTextBuiltIn);
        System.out.println("Are the two trimmed texts equal? " + isEqual);

        // Close the scanner
        scanner.close();
    }
}
