import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the  string as input
        System.out.println("Enter the string");
        String s = sc.nextLine();

        //Taking the character as input
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                str.append(s.charAt(i));
            }
        }

        System.out.println("Modified String: " + str);

    }
}
