import java.util.Scanner;

public class GCDandLCMCalculator {

    // Function to take input
    public static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        return new int[] { num1, num2 };
    }

    // Function to calculate the GCD (Greatest Common Divisor) of two numbers
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // The GCD is found when b becomes 0
    }

    // Function to calculate the LCM of two numbers
    public static int calculateLCM(int a, int b) {
        int gcd = calculateGCD(a, b);
        return (a * b) / gcd;
    }

    // Function to display the results
    public static void displayResults(int gcd, int lcm) {
        System.out.println("The Greatest Common Divisor (GCD) is: " + gcd);
        System.out.println("The Least Common Multiple (LCM) is: " + lcm);
    }

    // Main function
    public static void main(String[] args) {
        // Get input from the user
        int[] numbers = getInput();
        int num1 = numbers[0];
        int num2 = numbers[1];

        // Calculate the GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        // Display the results
        displayResults(gcd, lcm);
    }
}
