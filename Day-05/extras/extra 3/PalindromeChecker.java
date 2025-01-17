import java.util.Scanner;

public class PalindromeChecker {

    // Function to take input
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    // Function to check if the given string is a palindrome
    public static boolean isPalindrome(String str) {
        int length = str.length();

        // Compare characters from both ends of the string
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false; // Not a palindrome
            }
        }

        return true; // It's a palindrome
    }

    // Function to display the result
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    // Main function
    public static void main(String[] args) {
        // Get input from the user
        String input = getInput();

        // Check if the input is a palindrome
        boolean result = isPalindrome(input);

        // Display the result
        displayResult(input, result);
    }
}
