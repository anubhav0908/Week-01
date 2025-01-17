import java.util.Scanner;

public class MaximumOfThreeNumbers {

    // Function to take three integer inputs from the user
    public static int[] getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        return new int[] { num1, num2, num3 };
    }

    // Function to find the maximum value among three integers using Math.max()
    public static int findMaximum(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3); // Finding max of three numbers
    }

    // Main function to execute the program
    public static void main(String[] args) {
        // Get input from the user
        int[] numbers = getInput();

        // Find and display the maximum value
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);
        System.out.println("The maximum of the three numbers is: " + max);
    }
}

