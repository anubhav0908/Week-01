import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year is valid for years >= 1582 (Gregorian calendar)
        if (year >= 1582) {
            // Year is a leap year if divisible by 4, but not divisible by 100 unless also divisible by 400
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;  // It's a leap year
            }
        }
        return false;  // It's not a leap year
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Get user input for the year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year using the method
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the scanner
        input.close();
    }
}
