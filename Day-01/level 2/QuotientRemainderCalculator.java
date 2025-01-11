import java.util.Scanner;

public class QuotientRemainderCalculator {

    public static void main(String[] args) {

        // Declare variables for the numbers
        int number1 = 0, number2 = 0;   // For storing user input numbers
        int quotient = 0, remainder = 0; // For storing the quotient and remainder

        // Create Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // User input for the two numbers
        System.out.print("Enter the first number: ");
        number1 = input.nextInt(); // Input for number1

        System.out.print("Enter the second number: ");
        number2 = input.nextInt(); // Input for number2

        // Check to prevent division by zero
        if (number2 != 0) {
            // Calculate quotient and remainder
            quotient = number1 / number2;
            remainder = number1 % number2;

            // Output the result
            System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + 
                               " of two numbers " + number1 + " and " + number2);
        } else {
            // Handle division by zero case
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Close the scanner 
        input.close();
    }
}
