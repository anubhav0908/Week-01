import java.util.Scanner;

public class ChocolatesDistribution {

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;  // Quotient: chocolates per child
        int remainingChocolates = numberOfChocolates % numberOfChildren; // Remainder: leftover chocolates

        // Return an array containing chocolates per child at index 0 and remaining chocolates at index 1
        return new int[] { chocolatesPerChild, remainingChocolates };
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get user input for the number of chocolates and number of children
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Check if the number of children is greater than 0 to avoid division by zero
        if (numberOfChildren <= 0) {
            System.out.println("Error: The number of children must be greater than zero.");
        } else {
            // Call the method to find the number of chocolates each child gets and the remaining chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Output the result
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("The remaining chocolates are: " + result[1]);
        }

        // Close the scanner
        input.close();
    }
}
