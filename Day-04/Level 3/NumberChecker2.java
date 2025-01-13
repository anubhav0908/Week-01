import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker2 {

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

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i]; // Reverse the array
        }
        
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; // If any element doesn't match, return false
            }
        }
        
        return true; // If all elements match, return true
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigitsArray(digits);
        
        // Check if the original digits array is equal to the reversed one
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        
        // A Duck number has a non-zero digit present in it and doesn't start with 0
        if (digits[0] == 0) {
            for (int i = 1; i < digits.length; i++) {
                if (digits[i] != 0) { // A Duck number has at least one non-zero digit after leading zero
                    return true;
                }
            }
        }
        
        return false; // If no non-zero digits after leading zero or starts with non-zero, return false
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number");
        int number = sc.nextInt();  // Example number, you can change this to test other numbers

        // Find count of digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Store digits in an array
        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Reverse the digits array
        int[] reversedDigits = reverseDigitsArray(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));

        // Compare original digits array and reversed digits array
        boolean areEqual = compareArrays(digits, reversedDigits);
        System.out.println("Are original digits and reversed digits equal? " + areEqual);

        // Check if the number is a palindrome
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is the number a palindrome? " + isPalindrome);

        // Check if the number is a duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is the number a Duck Number? " + isDuck);
    }
}
