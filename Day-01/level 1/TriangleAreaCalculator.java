import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for the base and height of the triangle
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = input.nextDouble();  // Take the base of the triangle

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = input.nextDouble();  // Take the height of the triangle

        // Calculate the area in square inches
        double areaInches = 0.5 * base * height;

        // Convert the area to square centimeters (1 inch = 2.54 cm)
        double areaCm = areaInches * Math.pow(2.54, 2);

        // Output the results
        System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");

        // Close the scanner object to avoid memory leaks
        input.close();
    }
}
