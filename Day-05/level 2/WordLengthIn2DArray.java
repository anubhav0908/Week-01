import java.util.Scanner;

public class WordLengthIn2DArray {

    // Method to find the length of a String without using the length() method
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

    // Method to split the text into words using the charAt() method
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

    // Method to create a 2D array with words and their corresponding lengths
    public static String[][] create2DArrayWithWordLengths(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Store the word
            wordLengthArray[i][1] = String.valueOf(findLengthWithoutLengthMethod(words[i])); // Store the word's length as a String
        }

        return wordLengthArray;
    }

    // Method to display the 2D array in a tabular format
    public static void displayWordLengthTable(String[][] wordLengthArray) {
        System.out.println("Word\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            // Convert the length value from String to Integer to display in tabular format
            System.out.println(wordLengthArray[i][0] + "\t" + Integer.parseInt(wordLengthArray[i][1]));
        }
    }

    // Method to find the shortest and longest string
    public static String[] findShortestAndLongestString(String[] words) {
        String shortestWord = words[0];
        String longestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            // Update shortest word if a smaller word is found
            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
            // Update longest word if a larger word is found
            else if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        return new String[] { shortestWord, longestWord };
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take the text input from the user
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Split the text into words using the user-defined method
        String[] words = splitTextUsingCharAt(inputText);

        // Create a 2D array with words and their corresponding lengths
        String[][] wordLengthArray = create2DArrayWithWordLengths(words);

        // Display the result in tabular format
        displayWordLengthTable(wordLengthArray);

        // Find and display the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongestString(words);
        System.out.println("\nShortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        // Close the scanner
        scanner.close();
    }
}
