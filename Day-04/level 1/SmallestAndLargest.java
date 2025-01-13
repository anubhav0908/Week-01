import java.util.Scanner;

public class SmallestAndLargest {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest, largest;

        // Find smallest
        if (number1 <= number2 && number1 <= number3) {
            smallest = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            smallest = number2;
        } else {
            smallest = number3;
        }

        // Find largest
        if (number1 >= number2 && number1 >= number3) {
            largest = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            largest = number2;
        } else {
            largest = number3;
        }

        // Return an array with smallest at index 0 and largest at index 1
        return new int[] { smallest, largest };
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get user input for the three numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Call the method to find the smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Output the smallest and largest numbers
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        // Close the scanner
        input.close();
    }
}
