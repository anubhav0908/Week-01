import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
	
	    // create the scanner object to read the input
        Scanner input = new Scanner(System.in);
		
		//user input
		System.out.println("please provide the positive integer");
        
		//take input from the user
        int number = input.nextInt();
		
        // create an array
        String[] array = new String[number];

        for(int i=1;i<=number;i++){
            if(i%3==0&&i%5==0){
                array[i-1] = "FizzBuzz";
            }
            else if(i%3==0){
                array[i-1] = "Fizz";
            }
            else if(i%5==0){
                array[i-1] = "Buzz";
            }
            else{
                array[i-1] = Integer.toString(i);
            }
        }

        for(int i=0;i<number;i++){
            System.out.println((i+1)+" = "+array[i]);
        }
		//close the scanner
		input.close();
    }
}