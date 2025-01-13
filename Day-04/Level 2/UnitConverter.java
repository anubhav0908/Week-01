public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;  // Multiply kilometers by the conversion factor
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;  // Multiply miles by the conversion factor
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;  // Multiply meters by the conversion factor
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;  // Multiply feet by the conversion factor
    }

    public static void main(String[] args) {
        // Testing the UnitConverter class methods

        // Example: Convert kilometers to miles
        double km = 10;
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        // Example: Convert miles to kilometers
        double milesInput = 6.2;
        double kmOutput = convertMilesToKm(milesInput);
        System.out.println(milesInput + " miles is equal to " + kmOutput + " kilometers.");

        // Example: Convert meters to feet
        double meters = 100;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        // Example: Convert feet to meters
        double feetInput = 328;
        double metersOutput = convertFeetToMeters(feetInput);
        System.out.println(feetInput + " feet is equal to " + metersOutput + " meters.");
    }
}
