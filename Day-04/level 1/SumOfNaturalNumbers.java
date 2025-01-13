import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of first n natural numbers using a loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // Add each number from 1 to n to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a positive integer n
        System.out.print("Enter a positive integer n: ");
        int n = input.nextInt();

        // Ensure the user enters a positive integer
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the sum of the first n natural numbers
            int sum = sumOfNaturalNumbers(n);
            // Output the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        // Close the scanner
        input.close();
    }
}
