import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Get the number input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the max factor size and create the factors array
        int maxFactor = 10;  // Initial size of the array
        int[] factors = new int[maxFactor];  // Array to store the factors
        int index = 0;  // Index to keep track of where to store the next factor

        // Loop through numbers from 1 to the entered number to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  // If i is a factor of the number
                // Check if we need to expand the array
                if (index == maxFactor) {
                    // Double the size of the array
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    // Copy existing factors to the new temp array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    // Assign the temp array back to factors
                    factors = temp;
                }
                // Store the factor in the array
                factors[index++] = i;
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // Close the scanner 
        scanner.close();
    }
}
