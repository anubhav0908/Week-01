import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number (greater than 0)
        if (number <= 0) {
            System.out.println("Error: The number must be a natural number (greater than 0).");
            return; // Exit the program if the input is invalid
        }

        // Create arrays to store odd and even numbers
        // The size is number / 2 + 1 to handle the worst case (number is odd)
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // Initialize index variables for odd and even numbers
        int oddIndex = 0;
        int evenIndex = 0;

        // Loop through numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // If the number is even, add it to the evenNumbers array
                evenNumbers[evenIndex++] = i;
            } else {
                // If the number is odd, add it to the oddNumbers array
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print the even numbers array
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        // Close the scanner
        scanner.close();
    }
}
