import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the quotient and remainder of two numbers
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // Calculate quotient
        int remainder = number % divisor;  // Calculate remainder

        // Return an array containing quotient at index 0 and remainder at index 1
        return new int[] { quotient, remainder };
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get user input for the number and divisor
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Check if the divisor is zero to avoid division by zero error
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Call the method to find the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Output the quotient and remainder
            System.out.println("The quotient is: " + result[0]);
            System.out.println("The remainder is: " + result[1]);
        }

        // Close the scanner
        input.close();
    }
}
