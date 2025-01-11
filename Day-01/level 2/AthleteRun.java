import java.util.Scanner;

public class AthleteRun {

    public static void main(String[] args) {

        // Declare the variables for the sides of the triangle and the total distance
        double side1, side2, side3;
        double perimeter, totalRounds;
        final double targetDistance = 5000;  // 5 kilometers = 5000 meters

        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // User input for the sides of the triangle
        System.out.print("Enter the length of side1 (in meters): ");
        side1 = input.nextDouble();

        System.out.print("Enter the length of side2 (in meters): ");
        side2 = input.nextDouble();

        System.out.print("Enter the length of side3 (in meters): ");
        side3 = input.nextDouble();

        // Calculate the perimeter of the triangle (sum of all sides)
        perimeter = side1 + side2 + side3;

        // Calculate the number of rounds required to complete the 5 km run
       totalRounds = targetDistance / perimeter;
	
		

        // Output the result
        System.out.println("The total number of rounds the athlete will run is" +totalRounds+ "to complete 5 km");

        // Close the scanner 
        input.close();
    }
}
