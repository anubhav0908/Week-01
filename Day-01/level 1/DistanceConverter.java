public class DistanceConverter {
    public static void main(String[] args) {
        // Given distance in kilometers
        double kilometers = 10.8;

        // Conversion factor: 1 km = 1.6 miles
        double miles = kilometers * 1.6;

        // Output the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
