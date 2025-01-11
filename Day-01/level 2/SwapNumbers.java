import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        // Declare variables for number1, number2
        double number1, number2, temp;

        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // User input for number1
        System.out.print("Enter number1: ");
        number1 = input.nextDouble();  // Read number1 value

        // User input for number2
        System.out.print("Enter number2: ");
        number2 = input.nextDouble();  // Read number2 value

        // Swap the values of number1 and number2 using a temporary variable
        temp = number1;
        number1 = number2;
        number2 = temp;

        // Output the swapped values
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        // Close the scanner 
        input.close();
    }
}
