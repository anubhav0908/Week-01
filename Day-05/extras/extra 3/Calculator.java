import java.util.Scanner;

public class Calculator {

    // method to perform addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // method to perform subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // method to perform multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // method to perform division
    public static double divide(double num1, double num2) {
        // Checking if the denominator is 0 to avoid division by zero
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;  // Return NaN (Not a Number) if division by zero occurs
        }
        return num1 / num2;
    }

    // method to get user input for the numbers
    public static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        double num1 = getInput("Enter the first number: ");
        double num2 = getInput("Enter the second number: ");

        // Display operation choices
        System.out.println("\nChoose the operation you want to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Get user choice for the operation
        System.out.print("Enter the number of the operation: ");
        int choice = scanner.nextInt();

        double result;

        // Perform the chosen operation
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("The result of addition is: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("The result of subtraction is: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("The result of multiplication is: " + result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {  // Only display result if not NaN (division by zero)
                    System.out.println("The result of division is: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 4.");
        }
    }
}
