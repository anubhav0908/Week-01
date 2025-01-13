import java.util.Scanner;

public class NumberChecker {

    // Method to check if a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;  // Returns true if the number is positive, false if negative
    }

    // Method to check if a number is even or odd
    public static String isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers and return 1, 0, or -1
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;  // num1 is greater
        } else if (num1 == num2) {
            return 0;  // both numbers are equal
        } else {
            return -1; // num1 is smaller
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store 5 numbers
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Loop through the array and check if each number is positive or negative
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (isPositive(num)) {
                System.out.println(num + " is positive and it is " + isEvenOrOdd(num) + ".");
            } else {
                System.out.println(num + " is negative.");
            }
        }

        // Compare the first and last elements of the array
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        input.close();  // Close the scanner 
    }
}
