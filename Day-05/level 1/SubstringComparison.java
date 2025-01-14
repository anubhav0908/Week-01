import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt() method
    public static String getSubstringUsingCharAt(String text, int start, int end) {
        String str= "";
        for (int i = start; i < end; i++) {
            str+=text.charAt(i);
        }
        return str;
    }

    // Method to compare two strings and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2); // Compares two strings for equality
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking the input string, start index, and end index from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        // Creating a substring using charAt() method
        String substringUsingCharAt = getSubstringUsingCharAt(inputString, startIndex, endIndex);

        // Creating a substring using the String built-in substring() method
        String substringUsingSubstringMethod = inputString.substring(startIndex, endIndex);

        // Comparing both substrings
        boolean areSubstringsEqual = compareStrings(substringUsingCharAt, substringUsingSubstringMethod);

        // Displaying the results
        System.out.println("\nSubstring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using substring(): " + substringUsingSubstringMethod);
        System.out.println("Are the two substrings equal? " + areSubstringsEqual);

        // Closing the scanner
        scanner.close();
    }
}
