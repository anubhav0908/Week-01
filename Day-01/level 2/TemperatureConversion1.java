import java.util.Scanner;

public class TemperatureConversion1 {

    public static void main(String[] args) {

        // Declare the variable for Fahrenheit and the result for Celsius
        double fahrenheit = 0.0;
        double celsiusResult = 0.0;

        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // User input for Fahrenheit temperature
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();  // Read the temperature in Fahrenheit

        // Convert Fahrenheit to Celsius using the formula
        celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Output the result
        System.out.println(fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");

        // Close the scanner 
        input.close();
    }
}
