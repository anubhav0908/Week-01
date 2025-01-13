public class UnitConverter1 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;  // Multiply yards by the conversion factor
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;  // Multiply feet by the conversion factor
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;  // Multiply meters by the conversion factor
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;  // Multiply inches by the conversion factor
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;  // Multiply inches by the conversion factor
    }

    public static void main(String[] args) {
        // Testing the UnitConverter class methods

        // Example: Convert yards to feet
        double yards = 5;
        double feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");

        // Example: Convert feet to yards
        double feetInput = 15;
        double yardsOutput = convertFeetToYards(feetInput);
        System.out.println(feetInput + " feet is equal to " + yardsOutput + " yards.");

        // Example: Convert meters to inches
        double meters = 10;
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches.");

        // Example: Convert inches to meters
        double inchesInput = 100;
        double metersOutput = convertInchesToMeters(inchesInput);
        System.out.println(inchesInput + " inches is equal to " + metersOutput + " meters.");

        // Example: Convert inches to centimeters
        double inchesForCm = 50;
        double cm = convertInchesToCentimeters(inchesForCm);
        System.out.println(inchesForCm + " inches is equal to " + cm + " centimeters.");
    }
}
