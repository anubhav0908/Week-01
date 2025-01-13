import java.util.Scanner;

public class NumberCheck {

    // Method to check if the number is negative, positive, or zero
    public static int checkNumber(int number) {
        if (number < 0) {
            return -1; // Negative number
        } else if (number > 0) {
            return 1; // Positive number
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Call the method to check the number
        int result = checkNumber(number);

        // Output the result based on the method's return value
        if (result == -1) {
            System.out.println("The number is negative.");
        } else if (result == 1) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner
        input.close();
    }
}
