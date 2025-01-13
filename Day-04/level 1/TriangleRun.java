import java.util.Scanner;

public class TriangleRun {

    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds needed to complete a 5km run
    public static double calculateRounds(double perimeter) {
        double distanceToRun = 5000; // 5 km in meters
        return distanceToRun / perimeter;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get the lengths of the sides of the triangle from the user
        System.out.print("Enter the length of the first side of the triangle (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of the second side of the triangle (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of the third side of the triangle (in meters): ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Calculate the number of rounds needed to complete a 5km run
        double rounds = calculateRounds(perimeter);

        // Output the result
        System.out.printf("To complete a 5 km run, the athlete needs to complete %.2f rounds of the triangle.%n", rounds);

        // Close the scanner
        input.close();
    }
}
