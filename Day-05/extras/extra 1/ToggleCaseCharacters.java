import java.util.Scanner;

public class ToggleCaseCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String input=sc.nextLine();
        StringBuilder str=new StringBuilder("");
        for(int i=0; i<input.length(); i++){
            char ch=input.charAt(i);
            if(Character.isUpperCase(ch)){
            str.append(Character.toLowerCase(ch));
            }
            else{
                str.append(Character.toUpperCase(ch));
            }
        }
        System.out.println("after toggling : "+ str);


    }
}
