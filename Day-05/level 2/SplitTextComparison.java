import java.util.Scanner;

public class SplitTextComparison {

    // Method to find the length of the String without using the built-in length() method
    public static int findLengthWithoutLengthMethod(String text) {
        int count = 0;
        try {
            // Infinite loop to count characters until charAt() throws an exception
            while (true) {
                text.charAt(count); // Try to access each character
                count++; // Increment the count for each character
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the exception when we go beyond the string's length
            return count; // Return the count which is the length of the string
        }
    }

    // Method to split the text into words without using the String built-in split() method
    public static String[] splitTextUsingCharAt(String text) {
        int textLength = findLengthWithoutLengthMethod(text);

        // First, count the number of words by checking spaces
        int wordCount = 1; // There's at least one word
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create an array to store the words
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;

        // Split the text based on spaces
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ' || i == textLength - 1) {
                // If we encounter a space or the last character, extract the word
                if (i == textLength - 1 && text.charAt(i) != ' ') {
                    i++; // Include the last character in the last word
                }
                words[wordIndex] = text.substring(start, i).trim();
                wordIndex++;
                start = i + 1; // Set the start index for the next word
            }
        }

        return words;
    }

    // Method to compare two string arrays and return a boolean result
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false; // Arrays are not equal if their lengths differ
        }
        // Use traditional for loop to compare arrays
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false; // Arrays are not equal if any word differs
            }
        }
        return true; // Arrays are equal if no differences were found
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take the text input from the user
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Split the text using the user-defined method
        String[] wordsUsingCharAt = splitTextUsingCharAt(inputText);

        // Split the text using the built-in split() method
        String[] wordsUsingSplitMethod = inputText.split("\\s+");

        // Compare the two string arrays using a traditional for loop
        boolean areArraysEqual = compareStringArrays(wordsUsingCharAt, wordsUsingSplitMethod);

        // Display the results using traditional for loop
        System.out.println("\nWords using user-defined method (charAt):");
        for (int i = 0; i < wordsUsingCharAt.length; i++) {
            System.out.print(wordsUsingCharAt[i] + " ");
        }

        System.out.println("\nWords using built-in split() method:");
        for (int i = 0; i < wordsUsingSplitMethod.length; i++) {
            System.out.print(wordsUsingSplitMethod[i] + " ");
        }

        // Display the result of the comparison
        System.out.println("\nAre the two word arrays equal? " + areArraysEqual);

        // Close the scanner
        scanner.close();
    }
}
