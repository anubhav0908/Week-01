import java.util.Scanner;

public class FactorialCalculator {

    // Function to take input
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        return scanner.nextInt();
    }

    // Recursive function to calculate the factorial of a number
    public static int calculateFactorial(int number) {
        // factorial of 0 or 1 is 1
        if (number == 0 || number == 1) {
            return 1;
        }
        //  n! = n * (n-1)!
        return number * calculateFactorial(number - 1);
    }

    // Function to display the result
    public static void displayResult(int number, int factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Main function
    public static void main(String[] args) {
        // Get input from the user
        int number = getInput();

        // Calculate the factorial using the recursive function
        int factorial = calculateFactorial(number);

        // Display the result
        displayResult(number, factorial);
    }
}

