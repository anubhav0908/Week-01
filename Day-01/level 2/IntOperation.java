import java.util.Scanner;

public class IntOperation {

    public static void main(String[] args) {

        // Declare variables for a, b, and c
        int a = 0, b = 0, c = 0;
        int result1, result2, result3, result4;

        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // User input for a, b, and c
        System.out.print("Enter value for a: ");
        a = input.nextInt(); // Input for a

        System.out.print("Enter value for b: ");
        b = input.nextInt(); // Input for b

        System.out.print("Enter value for c: ");
        c = input.nextInt(); // Input for c

        // Perform integer operations considering operator precedence
        result1 = a + b * c;      // a + (b * c)
        result2 = a * b + c;      // (a * b) + c
        result3 = c + a / b;      // c + (a / b)
        result4 = a % b + c;      // (a % b) + c

        // Output the results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        // Close the scanner 
        input.close();
    }
}
