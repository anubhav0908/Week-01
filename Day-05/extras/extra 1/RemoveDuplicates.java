import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the String whose dublicates you wanted to remove");
        String input=sc.nextLine();
        String str="";
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<input.length(); i++){
            if(!hs.contains(input.charAt(i))){
                str+=input.charAt(i);
            }
               hs.add(input.charAt(i));
        }
//        System.out.println(hs);
        System.out.println(str);
    }
}
