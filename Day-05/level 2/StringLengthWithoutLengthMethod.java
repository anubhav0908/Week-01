import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find the length of a string without using the length() method
    public static int findLengthWithoutLengthMethod(String text) {
        int count = 0;
        try {
            // Infinite loop to count characters until charAt() throws an exception
            while (true) {
                text.charAt(count); // Try to access each character
                count++; // Increment the count for each character
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the exception when we go beyond the string's length
            return count; // Return the count which is the length of the string
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take the string input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Find the length of the string using the user-defined method
        int lengthWithoutLengthMethod = findLengthWithoutLengthMethod(inputString);

        // Find the length of the string using the built-in length() method
        int lengthUsingLengthMethod = inputString.length();

        // Display the results
        System.out.println("\nLength of the string using user-defined method: " + lengthWithoutLengthMethod);
        System.out.println("Length of the string using built-in length() method: " + lengthUsingLengthMethod);

        // Close the scanner
        scanner.close();
    }
}
