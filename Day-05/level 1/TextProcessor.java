import java.util.Scanner;

public class TextProcessor {

    // Converts all uppercase letters to lowercase manually
    public static String manualToLowercase(String input) {
        StringBuilder lowercaseResult = new StringBuilder();
        for (int idx = 0; idx < input.length(); idx++) {
            char currentChar = input.charAt(idx);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                lowercaseResult.append((char) (currentChar + 32)); // Shift ASCII to lowercase
            } else {
                lowercaseResult.append(currentChar);
            }
        }
        return lowercaseResult.toString();
    }

    // Compares two strings by iterating character by character
    public static boolean areStringsIdentical(String first, String second) {
        if (first.length() != second.length()) {
            return false; // Quick return if lengths differ
        }
        for (int idx = 0; idx < first.length(); idx++) {
            if (first.charAt(idx) != second.charAt(idx)) {
                return false; // Found a mismatch
            }
        }
        return true; // If no mismatches, strings are identical
    }

    // Splits input into words and returns their lengths
    public static String[][] splitWordsAndLengths(String inputText) {
        String[] splitWords = inputText.split(" ");
        String[][] wordData = new String[splitWords.length][2];
        for (int wordIdx = 0; wordIdx < splitWords.length; wordIdx++) {
            wordData[wordIdx][0] = splitWords[wordIdx]; // Store the word
            wordData[wordIdx][1] = String.valueOf(splitWords[wordIdx].length()); // Store its length
        }
        return wordData;
    }

    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Please type a sentence");
        String userText = userInputScanner.nextLine();

        // Convert text to lowercase using manual method
        String manuallyConverted = manualToLowercase(userText);

        // Convert text to lowercase using Java's built-in method
        String builtInConverted = userText.toLowerCase();

        // Compare both results to ensure they match
        boolean areSame = areStringsIdentical(manuallyConverted, builtInConverted);

        // Display conversion results
        System.out.println("Lowercase (manual method): " + manuallyConverted);
        System.out.println("Lowercase (built-in method): " + builtInConverted);
        System.out.println("Do both results match? " + areSame);

        // Split words and display them along with lengths
        String[][] wordsWithLengths = splitWordsAndLengths(userText);
        System.out.println("Words and their respective lengths:");
        for (String[] wordInfo : wordsWithLengths) {
            System.out.println("Word: \"" + wordInfo[0] + "\", Length: " + wordInfo[1]);
        }
    }
}