import java.math.BigInteger;
import java.util.Scanner;

public class NumberChecker4 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        // Find the count of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        // Store the factors in an array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor using the factors array
    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 1]; // The greatest factor is the last one in the sorted array
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static double productOfCubeOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = sumOfFactors(number) - number; // Subtract the number itself to get the proper divisors
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = sumOfFactors(number) - number;
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = sumOfFactors(number) - number;
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    // Helper method to calculate the factorial of a number
    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the number");
        int number = sc.nextInt(); // Example number, you can change this to test other numbers

        // Find factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find the greatest factor
        int greatest = greatestFactor(number);
        System.out.println("Greatest factor: " + greatest);

        // Find the sum of the factors
        int sumOfFactors = sumOfFactors(number);
        System.out.println("Sum of factors: " + sumOfFactors);

        // Find the product of the factors
        int productOfFactors = productOfFactors(number);
        System.out.println("Product of factors: " + productOfFactors);

        // Find the product of the cube of the factors
        double productOfCube = productOfCubeOfFactors(number);
        System.out.println("Product of cubes of factors: " + productOfCube);

        // Check if the number is a perfect number
        boolean isPerfect = isPerfectNumber(number);
        System.out.println("Is perfect number? " + isPerfect);

        // Check if the number is an abundant number
        boolean isAbundant = isAbundantNumber(number);
        System.out.println("Is abundant number? " + isAbundant);

        // Check if the number is a deficient number
        boolean isDeficient = isDeficientNumber(number);
        System.out.println("Is deficient number? " + isDeficient);

        // Check if the number is a strong number
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is strong number? " + isStrong);
    }
}
