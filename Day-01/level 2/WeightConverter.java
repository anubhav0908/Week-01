import java.util.Scanner;

public class WeightConverter {

    public static void main(String[] args) {

        // Declare variables for weight in pounds and kilograms
        double weightInPounds, weightInKg;

        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // User input for weight in pounds
        System.out.print("Enter the weight in pounds: ");
        weightInPounds = input.nextDouble();

        // Convert weight from pounds to kilograms using the conversion factor
        weightInKg = weightInPounds * 2.2;

        // Output the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + 
                           " and in kilograms is " + weightInKg);

        // Close the scanner
		input.close();
    }
}
