import java.util.Scanner;

public class ReplaceMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the sentence
        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();

        // Input the word to be replaced
        System.out.println("Enter the word to replace:");
        String wordToReplace = sc.next();

        // Input the replacement word
        System.out.println("Enter the replacement word:");
        String replacementWord = sc.next();

        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);

        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.equals(wordToReplace)) {
                result.append(replacementWord).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        return result.toString();
    }
}

