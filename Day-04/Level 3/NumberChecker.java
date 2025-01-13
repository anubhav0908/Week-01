import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {

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

    // Method to check if the number is a Duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        // A Duck number has a non-zero digit in it and starts with a zero
        if (digits[0] == 0) { // Starts with zero
            for (int i = 1; i < digits.length; i++) {
                if (digits[i] != 0) { // If there's any non-zero digit
                    return true;
                }
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int numDigits = digits.length;
        int sum = 0;
        
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], numDigits); // Sum of digits raised to the power of the number of digits
        }
        
        return sum == number; // Check if the sum equals the original number
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }

        return new int[]{smallest, secondSmallest};
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

        // Check if the number is a Duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + isDuck);

        // Check if the number is an Armstrong number
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        // Find the largest and second largest elements in the digits array
        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largest[0]);
        System.out.println("Second largest digit: " + largest[1]);

        // Find the smallest and second smallest elements in the digits array
        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallest[0]);
        System.out.println("Second smallest digit: " + smallest[1]);
    }
}
