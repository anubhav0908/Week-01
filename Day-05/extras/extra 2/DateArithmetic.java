import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a date in the format yyyy-MM-dd
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateInput = scanner.nextLine();

        // Parse the input date string into a LocalDate object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateInput, formatter);

        // Add 7 days, 1 month, and 2 years to the date
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks from the new date
        newDate = newDate.minusWeeks(3);

        // Output the final result
        System.out.println("The modified date is: " + newDate);

        // Close the scanner
        scanner.close();
    }
}

