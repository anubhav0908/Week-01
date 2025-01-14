import java.util.Scanner;
public class StringCompare{
public static boolean checkequals(String str1,String str2){
if(str1.equals(str2)){
return true;
}
else{
return false;
}
}
public static boolean checkChar(String str1,String str2){
    if(str1.length()!=str2.length()){
	return false;
	}
	for(int i=0;i<str1.length();i++){
	if(str1.charAt(i)!=str2.charAt(i)){
	return false;
	}
	
	}
	return true;
}
public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
   System.out.println("Enter the String 1:");
   String string1=sc.next();
   System.out.println("Enter the String 2:");
   String string2=sc.next();
   boolean resultCharAt=checkequals(string1,string2);
   boolean resultEquals=checkChar(string1,string2);
   System.out.println("Comparison using charAt(): " + resultCharAt);
   System.out.println("Comparison using equals(): " + resultEquals);
     if (resultCharAt == resultEquals) {
            System.out.println("Both methods produce the same result.");
        } else {
         System.out.println("The methods produce different results.");
        }

}
}