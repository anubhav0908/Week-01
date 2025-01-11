import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {

        // Declare the variable for Celsius and the result for Fahrenheit
        double celsius = 0.0;
        double fahrenheitResult = 0.0;

        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // User input for Celsius temperature
        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();  // Read the temperature in Celsius

        // Convert Celsius to Fahrenheit using the formula
        fahrenheitResult = (celsius * 9/5) + 32;

        // Output the result
        System.out.println(celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

        // Close the scanner 
        input.close();
    }
}
