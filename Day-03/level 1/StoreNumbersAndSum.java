import java.util.Scanner;

public class StoreNumbersAndSum {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Define an array to store up to 10 double numbers and a variable to store the sum
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0; // Track the current index of the array

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (Enter 0 or a negative number to stop): ");
            double input = scanner.nextDouble();

            // Check if the input is 0 or negative, or if the array is full
            if (input <= 0 || index == 10) {
                break; // Exit the loop if input is 0, negative, or the array is full
            }

            // Store the valid input in the array and increment the index
            numbers[index] = input;
            index++;
        }

        // Calculate the total and display the numbers
        System.out.println("\nThe numbers you entered are:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i]; // Add each number to the total
        }

        // Display the sum of all numbers
        System.out.println("\nThe sum of all numbers is: " + total);

        // Close the scanner 
        scanner.close();
    }
}
