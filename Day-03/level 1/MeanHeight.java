import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Define an array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Get input for each player's height
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Calculate the sum of all heights
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // Calculate the mean height
        double meanHeight = sum / heights.length;

        // Display the mean height
        System.out.println("\nThe mean height of the football team is: " + meanHeight);

        // Close the scanner 
        scanner.close();
    }
}
