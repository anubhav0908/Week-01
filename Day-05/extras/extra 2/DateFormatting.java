import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define the DateTimeFormatter with the required patterns
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Format the current date using the defined patterns
        String formattedDate1 = currentDate.format(formatter1);
        String formattedDate2 = currentDate.format(formatter2);
        String formattedDate3 = currentDate.format(formatter3);

        // Display the formatted dates
        System.out.println("Current date in dd/MM/yyyy format: " + formattedDate1);
        System.out.println("Current date in yyyy-MM-dd format: " + formattedDate2);
        System.out.println("Current date in EEE, MMM dd, yyyy format: " + formattedDate3);
    }
}
