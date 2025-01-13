import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;  // Base case: sum of 1 natural number is 1
        } else {
            return n + sumUsingRecursion(n - 1);  // Recursive case
        }
    }

    // Method to find the sum of n natural numbers using the formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("The input is not a natural number. Exiting...");
            return;  // Exit the program if the number is not a natural number
        }

        // Find the sum using recursion
        int sumRecursion = sumUsingRecursion(n);

        // Find the sum using the formula
        int sumFormula = sumUsingFormula(n);

        // Compare the results
        if (sumRecursion == sumFormula) {
            System.out.println("Both results are correct!");
        } else {
            System.out.println("There is an error in the calculations.");
        }

        // Output both results
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);

        // Close the scanner
        input.close();
    }
}
