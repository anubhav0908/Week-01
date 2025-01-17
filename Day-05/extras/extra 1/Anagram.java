import java.util.Scanner;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking two strings as input
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
        } else {
            HashMap<Character, Integer> map = new HashMap<>();


            for (int i = 0; i < str1.length(); i++) {
                char ch = str1.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }


            for (int i = 0; i < str2.length(); i++) {
                char ch = str2.charAt(i);
                if (!map.containsKey(ch)) {
                    System.out.println("The strings are not anagrams.");
                    return;
                }
                map.put(ch, map.get(ch) - 1);
            }


            for (int count : map.values()) {
                if (count != 0) {
                    System.out.println("The strings are not anagrams.");
                    return;
                }
            }

            System.out.println("The strings are anagrams.");
        }
    }
}

