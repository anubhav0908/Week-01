import java.util.Scanner;

public class CalendarDisplay {

    // Array of month names
    private static final String[] monthNames = {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };

    // Array of number of days in each month
    private static final int[] daysInMonth = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Method to check if the given year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        return monthNames[month - 1];
    }

    // Method to get the number of days in a month
    public static int getNumberOfDaysInMonth(int month, int year) {
        // Adjust February for leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to calculate the first day of the month using Gregorian calendar formula
    public static int getFirstDayOfMonth(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + 31 * m0 / 12) % 7;
        return d0;  // Return the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        // Get the name of the month
        String monthName = getMonthName(month);

        // Get the number of days in the month
        int numberOfDays = getNumberOfDaysInMonth(month, year);

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(1, month, year);

        // Print the month and year header
        System.out.println("\n\t\t" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");  // 4 spaces for each day of the week before the first day
        }

        // Print the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day); // Print each day, formatted to be right-justified within 3 spaces
            firstDay++;  // Move to the next day of the week

            // If Saturday (i.e., end of the week), print a new line
            if (firstDay == 7) {
                firstDay = 0; // Reset to Sunday
                System.out.println(); // Move to the next line
            }
        }

        // If the last printed day is not Saturday, print a new line
        if (firstDay != 0) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Display the calendar for the entered month and year
        displayCalendar(month, year);
        
        input.close();
    }
}
