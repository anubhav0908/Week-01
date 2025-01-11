import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for two numbers (floating-point)
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();  // Take the first number as input

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();  // Take the second number as input

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0;

        // Check for division by zero to avoid error
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Output the results
        System.out.println("The addition, subtraction, multiplication and division value of " 
            + number1 + " and " + number2 + " is " 
            + addition + ", " + subtraction + ", " 
            + multiplication + ", and " + division);

        // Close the scanner object to avoid memory leak
        input.close();
    }
}
