import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String input=sc.nextLine();
        String str="";
        for(int i=input.length()-1;i>=0;i--){
            str+=input.charAt(i);
        }
        System.out.println(str);


    }
}
