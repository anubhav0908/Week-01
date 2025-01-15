import java.util.Scanner;
public class VowelsAndConsonants{
public static void main(String args[]){
	
	//creating the object of scanner
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	
	// write a string
	String text=sc.nextLine();
	
	//calling the countvowel method
	int vowelcount=countvowel(text);
	
	//calling the countconst method
	int consoanntcount=countconst(text);
	System.out.println("number of vowels are: "+ vowelcount);
	System.out.println("number of consonants are: "+ consoanntcount);
	}
	public static int countvowel(String text){
	int count=0;
	
	//converting the input string to lower case 
	String str=text.toLowerCase();
	
	//loop for traversing the whole string 
	for(int i=0; i<text.length(); i++){
	//store each character of string in ch
	char ch= text.charAt(i);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
	count++;
	}
	}
	return count;
	}
	public static int countconst(String text){
	int count=0;
	String str=text.toLowerCase();
	for(int i=0; i<text.length(); i++){
	char ch=text.charAt(i);
	if((ch>='a' && ch<='z') &&(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')){
	count++;
	}
	}
	return count;
	}
	}
	
	
	
	
	
	