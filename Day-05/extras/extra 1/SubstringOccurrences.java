

import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String");
        String input=sc.nextLine();
        System.out.println("enter a substring");
        String input2=sc.nextLine();
        int count=0;
       int startingIndex=0;
       while(input.indexOf(input2,startingIndex)!=-1){
           int index=input.indexOf(input2,startingIndex);
           startingIndex=index+1;
           count++;
       }
        System.out.println("occurrence of substring are: "+ count);
    }
}
