public class SpringSeason {

    // Method to check if the given month and day fall within the Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Spring Season is from March 20 to June 20
        if (month > 3 && month < 6) {
            return true; // If it's March, April, or May
        } else if (month == 3 && day >= 20) {
            return true; // If it's March 20 or later
        } else if (month == 6 && day <= 20) {
            return true; // If it's June 20 or earlier
        }
        return false; // If the date is outside the Spring season
    }

    public static void main(String[] args) {
        // Ensure correct number of arguments (2 integers: month and day)
        if (args.length != 2) {
            System.out.println("Please provide two arguments: month and day.");
            return;
        }

        // Parse month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the given month and day are within Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
