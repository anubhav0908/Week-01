import java.util.Scanner;

public class PrimeNumberChecker {

    // Function to check whether a number is prime
    public static boolean isPrime(int number) {
        // Check if the number is less than or equal to 1 (not prime)
        if (number <= 1) {
            return false;
        }

        // Check for factors from 2 to the square root of the number
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // If a factor is found, it's not prime
            }
        }

        return true; // If no factors are found, it's prime
    }

    // Main function to execute the program
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime and print the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

