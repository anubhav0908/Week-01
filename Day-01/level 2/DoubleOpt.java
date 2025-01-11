import java.util.Scanner;

public class DoubleOpt {

    public static void main(String[] args) {

        // Declare variables for a, b, and c as double data types
        double a = 0.0, b = 0.0, c = 0.0;
        double result1, result2, result3, result4;

        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // User input for a, b, and c (double values)
        System.out.print("Enter value for a (double): ");
        a = input.nextDouble(); // Input for a

        System.out.print("Enter value for b (double): ");
        b = input.nextDouble(); // Input for b

        System.out.print("Enter value for c (double): ");
        c = input.nextDouble(); // Input for c

        // Perform double operations considering operator precedence
        result1 = a + b * c;      // a + (b * c)
        result2 = a * b + c;      // (a * b) + c
        result3 = c + a / b;      // c + (a / b)
        result4 = a % b + c;      // (a % b) + c

        // Output the results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        // Close the scanner 
        input.close();
    }
}
