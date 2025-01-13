import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate the number of handshakes using the combination formula
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get the number of students from the user
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        // Ensure the number of students is at least 2
        if (n < 2) {
            System.out.println("At least 2 students are required to have handshakes.");
        } else {
            // Calculate the maximum number of handshakes using the combination formula
            int handshakes = calculateHandshakes(n);

            // Output the result
            System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);
        }

        // Close the scanner
        input.close();
    }
}
