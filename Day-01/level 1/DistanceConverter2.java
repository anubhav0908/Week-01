import java.util.Scanner;

public class DistanceConverter2 {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();  // Take the distance in feet as input

        // Convert the distance to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert the distance to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Output the result
        System.out.println("The distance in feet is " + distanceInFeet + " which is " 
            + distanceInYards + " yards and " + distanceInMiles + " miles.");

        // Close the scanner 
        input.close();
    }
}
