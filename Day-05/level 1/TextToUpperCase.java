import java.util.Scanner;
public class TextToUpperCase {
    // Method to convert a string to uppercase using charAt()
    public static String convertToUpperCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the text:");
        String userInput = sc.nextLine();

        // Converting to uppercase using the custom method
        String customupperCase = convertToUpperCase(userInput);

        // Converting to uppercase using the built-in method
        String builtInupperCase = userInput.toUpperCase();

        // Comparing the two strings using the custom method
        boolean areEqual = compareStrings(customupperCase, builtInupperCase);

        // Displaying the results
        System.out.println("Custom Uppercase Conversion: " + customupperCase);
        System.out.println("Built-in Uppercase Conversion: " + builtInupperCase);
        System.out.println("Are both conversions equal? " + areEqual);

    }
}