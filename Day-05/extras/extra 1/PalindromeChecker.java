import java.sql.SQLOutput;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String input=sc.nextLine();
        String originalstring=input;
        String palindromeString="";
        for(int i=input.length()-1;i>=0;i--){
            palindromeString+=input.charAt(i);

        }
        if(originalstring.equals(palindromeString)){
            System.out.println("given string is palindrome");
        }

    }
}
