import java.util.Scanner;

public class CollinearityChecker {

    // Method to check if the three points are collinear using slope formula
    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes AB and BC
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Check if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check if the three points are collinear using area of triangle formula
    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // If area is zero, the points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        // Using Scanner object with the new keyword to take input from user
        Scanner input = new Scanner(System.in);
        
        // Input for the three points
        System.out.println("Enter coordinates of Point A (x1, y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        System.out.println("Enter coordinates of Point B (x2, y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        System.out.println("Enter coordinates of Point C (x3, y3): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Check if points are collinear using the slope method
        boolean collinearUsingSlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        if (collinearUsingSlope) {
            System.out.println("The points are collinear using the slope formula.");
        } else {
            System.out.println("The points are not collinear using the slope formula.");
        }

        // Check if points are collinear using the area of triangle method
        boolean collinearUsingArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        if (collinearUsingArea) {
            System.out.println("The points are collinear using the area formula.");
        } else {
            System.out.println("The points are not collinear using the area formula.");
        }

        // Close the scanner object
        input.close();
    }
}