import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        // Calculate the wind chill using the formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create an instance of WindChillCalculator to use the method
        WindChillCalculator calculator = new WindChillCalculator();

        // Get user input for temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();

        // Ensure wind speed is greater than or equal to 3 mph
        if (windSpeed < 3) {
            System.out.println("Wind speed must be at least 3 mph for wind chill calculation.");
        } else {
            // Calculate the wind chill
            double windChill = calculator.calculateWindChill(temperature, windSpeed);
            // Output the calculated wind chill
            System.out.println("The wind chill temperature is: " + windChill + " °F");
        }

        // Close the scanner
        input.close();
    }
}
