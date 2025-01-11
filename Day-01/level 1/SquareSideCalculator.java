import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();  // Take the perimeter as input

        // Calculate the side of the square
        double side = perimeter / 4;

        // Output the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        // Close the scanner object to avoid memory leaks
        input.close();
    }
}
