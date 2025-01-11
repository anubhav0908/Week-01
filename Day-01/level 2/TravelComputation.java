import java.util.Scanner;

class TravelComputation {

    public static void main(String[] args) {

        // Create a Scanner object to take user inputs
        Scanner input = new Scanner(System.in);

        // Take user input for name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Take user input for the cities (fromCity, viaCity, toCity)
        System.out.print("Enter the city you are starting from (e.g., Chennai): ");
        String fromCity = input.nextLine();

        System.out.print("Enter the city you are passing through (e.g., Vellore): ");
        String viaCity = input.nextLine();

        System.out.print("Enter the city you are going to (e.g., Bangalore): ");
        String toCity = input.nextLine();

        // Take user input for distances (fromCity to viaCity, viaCity to toCity)
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double distanceViaToFinalCity = input.nextDouble();

        // Take user input for the time taken for both legs of the journey
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in hours and minutes (e.g., 4 hours 4 minutes): ");
        int hoursFromToVia = input.nextInt();
        int minutesFromToVia = input.nextInt();
        int timeFromToVia = hoursFromToVia * 60 + minutesFromToVia; // Total time in minutes

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in hours and minutes (e.g., 4 hours 25 minutes): ");
        int hoursViaToFinalCity = input.nextInt();
        int minutesViaToFinalCity = input.nextInt();
        int timeViaToFinalCity = hoursViaToFinalCity * 60 + minutesViaToFinalCity; // Total time in minutes

        // Compute the total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("\nThe Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + 
                           " is " + totalDistance + " miles and the Total Time taken is " + totalTime + " minutes.");

        // Close the scanner to prevent resource leak
        input.close();
    }
}
