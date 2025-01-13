import java.util.Scanner;


public class NumberChecker3 {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself, not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        return sumOfDigits == number; // If the sum of digits of the square equals the original number
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product; // If the sum equals the product of digits
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;
        
        while (temp > 0) {
            if (square % 10 != temp % 10) {
                return false; // If any digit of the square doesn't match the number, not automorphic
            }
            square /= 10;
            temp /= 10;
        }

        return true; // If all digits of the number match the digits at the end of the square
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7; // Buzz number is divisible by 7 or ends with 7
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
        int number = sc.nextInt();;  // Example number, you can change this to test other numbers

        // Check if the number is prime
        boolean isPrime = isPrime(number);
        System.out.println("Is the number prime? " + isPrime);

        // Check if the number is a neon number
        boolean isNeon = isNeon(number);
        System.out.println("Is the number a neon number? " + isNeon);

        // Check if the number is a spy number
        boolean isSpy = isSpyNumber(number);
        System.out.println("Is the number a spy number? " + isSpy);

        // Check if the number is an automorphic number
        boolean isAutomorphic = isAutomorphic(number);
        System.out.println("Is the number an automorphic number? " + isAutomorphic);

        // Check if the number is a buzz number
        boolean isBuzz = isBuzzNumber(number);
        System.out.println("Is the number a buzz number? " + isBuzz);
    }
}
