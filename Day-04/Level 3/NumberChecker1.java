import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker1 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length(); // Convert number to string and get the length
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = number % 10; // Extract each digit
            number /= 10; // Remove last digit
        }
        
        return digits;
    }

    // Method to find the sum of the digits of the number using the digits array
    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i]; // Add each digit
        }
        
        return sum;
    }

    // Method to find the sum of the squares of the digits of the number using Math.pow()
    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        double sum = 0;
        
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2); // Add square of each digit
        }
        
        return sum;
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0; // A Harshad number is divisible by the sum of its digits
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2]; // 2D array to store digit and frequency
        
        // Initialize the first column with digits 0 to 9
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // First column holds digits 0 to 9
        }
        
        // Count the frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++; // Increment frequency of each digit
        }
        
        return frequency; // Return the frequency array
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
        int number = sc.nextInt();  // Example number, you can change this to test other numbers

        // Find count of digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Store digits in an array
        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Find sum of digits
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);

        // Find sum of squares of digits
        double sumOfSquares = sumOfSquaresOfDigits(number);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find frequency of each digit in the number
        int[][] frequency = digitFrequency(number);
        System.out.println("Frequency of digits:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) { // Only print digits that appear in the number
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " time(s)");
            }
        }
    }
}
