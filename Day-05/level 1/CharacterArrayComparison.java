import java.util.Scanner;

public class CharacterArrayComparison {

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharsWithoutToCharArray(String text) {
        char[] charArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i); // Filling the char array with individual characters
        }
        return charArray;
    }

    // Method to compare two char arrays and return a boolean result
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false; // Arrays are not equal if their lengths differ
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Arrays are not equal if any character differs
            }
        }
        return true; // Arrays are equal if no differences were found
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking the input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Getting the character array using the user-defined method
        char[] charArrayUserDefined = getCharsWithoutToCharArray(inputString);

        // Getting the character array using the String built-in toCharArray() method
        char[] charArrayBuiltIn = inputString.toCharArray();

        // Comparing the two character arrays
        boolean areArraysEqual = compareCharArrays(charArrayUserDefined, charArrayBuiltIn);

        // Displaying the results using a traditional for loop
        System.out.print("\nCharacter array using user-defined method: ");
        for (int i = 0; i < charArrayUserDefined.length; i++) {
            System.out.print(charArrayUserDefined[i] + " ");
        }

        System.out.print("\nCharacter array using toCharArray() method: ");
        for (int i = 0; i < charArrayBuiltIn.length; i++) {
            System.out.print(charArrayBuiltIn[i] + " ");
        }

        // Display the result of comparison
        System.out.println("\nAre the two character arrays equal? " + areArraysEqual);

        // Closing the scanner
        scanner.close();
    }
}
