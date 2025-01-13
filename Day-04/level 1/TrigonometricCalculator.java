import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate the sine, cosine, and tangent of an angle
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results in an array: [sine, cosine, tangent]
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create an instance of TrigonometricCalculator to use the method
        TrigonometricCalculator calculator = new TrigonometricCalculator();

        // Get user input for the angle in degrees
        System.out.print("Enter an angle in degrees: ");
        double angle = input.nextDouble();

        // Call the method to calculate the trigonometric functions
        double[] result = calculator.calculateTrigonometricFunctions(angle);

        // Output the results
        System.out.println("Sine of " + angle + "° is: " + result[0]);
        System.out.println("Cosine of " + angle + "° is: " + result[1]);
        System.out.println("Tangent of " + angle + "° is: " + result[2]);

        // Close the scanner
        input.close();
    }
}
