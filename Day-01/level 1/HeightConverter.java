import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();  // User inputs height in centimeters

        // Conversion constants
        double cmToInches = 2.54;  // 1 inch = 2.54 cm
        int inchesPerFoot = 12;    // 1 foot = 12 inches

        // Convert height from cm to inches
        double heightInches = heightCm / cmToInches;

        // Convert inches to feet and calculate remaining inches
        int feet = (int) heightInches / inchesPerFoot;
        int inches = (int) heightInches % inchesPerFoot;

        // Output the result
        System.out.println("Your height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);

        // Close the Scanner object to avoid memory leaks
        input.close();
    }
}
