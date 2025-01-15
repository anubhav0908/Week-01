import java.util.Scanner;

public class VowelConsonantCount {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char character) {
        // Convert character to lowercase to handle both uppercase and lowercase characters
        char lowerChar = Character.toLowerCase(character);

        // Check if the character is a letter
        if (lowerChar >= 'a' && lowerChar <= 'z') {
            // Check for vowels
            if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find the count of vowels and consonants in the string
    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Traverse each character in the string using charAt() method
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Check the character type (vowel, consonant, or not a letter)
            String characterType = checkCharacterType(currentChar);

            // Count vowels and consonants
            if (characterType.equals("Vowel")) {
                vowelCount++;
            } else if (characterType.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the result in an array [vowelCount, consonantCount]
        return new int[] { vowelCount, consonantCount };
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take the input string from the user
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the count of vowels and consonants in the string
        int[] counts = countVowelsAndConsonants(inputText);

        // Display the results
        System.out.println("Vowels count: " + counts[0]);
        System.out.println("Consonants count: " + counts[1]);

        // Close the scanner
        scanner.close();
    }
}
