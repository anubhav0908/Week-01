import java.util.Scanner;

public class FibonacciSequence {

    // Function to generate and print the Fibonacci sequence up to the specified number of terms
    public static void generateFibonacci(int terms) {
        // case when the number of terms is less than or equal to 0
        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
            return;
        }

        // First two Fibonacci numbers
        int first = 0, second = 1;

        // Print the first term
        System.out.print("Fibonacci Sequence: ");
        if (terms >= 1) {
            System.out.print(first + " ");
        }
        if (terms >= 2) {
            System.out.print(second + " ");
        }

        // Calculate and print subsequent Fibonacci numbers
        for (int i = 3; i <= terms; i++) {
            int nextTerm = first + second;
            System.out.print(nextTerm + " ");
            first = second;
            second = nextTerm;
        }
        System.out.println(); // Move to the next line after printing the sequence
    }

    // Main function t
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        // Call the function to generate and print the Fibonacci sequence
        generateFibonacci(terms);
    }
}

