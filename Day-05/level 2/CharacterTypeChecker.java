import java.util.Scanner;

public class CharacterTypeChecker {

    // Method to check if a character is a vowel, consonant, or not a letter
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
            return "Not a Letter";  // For non-alphabetical characters
        }
    }

    // Method to find vowels and consonants in the string and return them in a 2D array
    public static String[][] findVowelsAndConsonants(String text) {
        int textLength = text.length();
        // Create a 2D array to store the characters and their types
        String[][] characterTypes = new String[textLength][2];

        // Traverse the string using charAt() method
        for (int i = 0; i < textLength; i++) {
            char currentChar = text.charAt(i);
            String characterType = checkCharacterType(currentChar);

            // Store the character and its type (Vowel/Consonant/Not a Letter)
            characterTypes[i][0] = String.valueOf(currentChar);
            characterTypes[i][1] = characterType;
        }

        return characterTypes;
    }

    // Method to display the 2D array of character types in a tabular format
    public static void displayCharacterTypeTable(String[][] characterTypes) {
        System.out.println("Character\tType");
        for (int i = 0; i < characterTypes.length; i++) {
            // Display each character and its corresponding type
            System.out.println(characterTypes[i][0] + "\t\t" + characterTypes[i][1]);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take the input string from the user
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find vowels and consonants and their types in the string
        String[][] characterTypes = findVowelsAndConsonants(inputText);

        // Display the result in tabular format
        displayCharacterTypeTable(characterTypes);

        // Close the scanner
        scanner.close();
    }
}
