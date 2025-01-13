import java.util.Scanner;

public class FactorCalculator {

    // Method to find the factors of a number and store them in an array
    public static int[] findFactors(int number) {
        // First loop to find the count of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize an array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        
        return factors;
    }

    // Method to calculate the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of the factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the sum of squares of the factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);  // Using Math.pow to square the factor
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input (as per the request)
        Scanner input = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the factors of the number and store them in an array
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("The factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find the sum of the factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        // Find the product of the factors
        long product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);

        // Find the sum of the squares of the factors
        double sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        // Close the scanner
        input.close();
    }
}
