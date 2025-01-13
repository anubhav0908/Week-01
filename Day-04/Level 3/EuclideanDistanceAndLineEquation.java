import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    // Method to calculate the Euclidean distance between two points (x1, y1) and (x2, y2)
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Using the Euclidean distance formula
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to calculate the slope (m) and y-intercept (b) of the line passing through two points
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];

        // Calculate the slope m
        double m = (y2 - y1) / (x2 - x1);

        // Calculate the y-intercept b
        double b = y1 - m * x1;

        // Store the slope and y-intercept in the array
        equation[0] = m;  // Slope
        equation[1] = b;  // Y-intercept

        return equation;
    }

    public static void main(String[] args) {
        // Create a scanner to take input from user
        Scanner input = new Scanner(System.in);

        // Take input for the coordinates of the first point (x1, y1)
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        // Take input for the coordinates of the second point (x2, y2)
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate the Euclidean distance between the two points
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);

        // Display the Euclidean distance
        System.out.println("Euclidean Distance between the points: " + distance);

        // Calculate the slope and y-intercept of the line passing through the points
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);

        // Display the equation of the line in the form y = mx + b
        System.out.println("Equation of the line: y = " + lineEquation[0] + "x + " + lineEquation[1]);
        
        input.close();
    }
}
