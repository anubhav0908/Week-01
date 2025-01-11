import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for input in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();  // Take the distance input as a double

        // Conversion formula (1 mile = 1.6 kilometers)
        double miles = km / 1.6;

        // Output the result
        System.out.println("The total miles is " + miles + " miles for the given " + km + " km.");

        // Close the Scanner object to avoid memory leak
        input.close();
    }
}
