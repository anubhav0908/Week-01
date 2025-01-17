import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        String input=sc.nextLine();

        String [] str=input.split(" ");
        String longestWord=str[0];
        for(int i=0;i<str.length; i++){
            if(str[i].length()>longestWord.length()){
                longestWord=str[i];
            }
        }
        System.out.println(longestWord);



    }
}
