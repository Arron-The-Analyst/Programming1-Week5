package PracticalWork;
import java.util.Scanner;
public class Exercise3_SumOfDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int sum =0;
		System.out.println("Welcome to the sum of digits program");
		System.out.println(" ");
	do{	System.out.println("Please enter the String that you wish to return the sum of the digits for");
		String a = input.nextLine();
		
		for(int i=0; i<a.length(); i++){
		char c = a.charAt(i);    
			
		if(Character.isDigit(c)){
				sum = sum + Character.getNumericValue(c);}
		}
	System.out.println("The value of the digits in your string is: " + sum);
	System.out.println(" ");
	}while(true);
	}
}	
		
	
			
			
		
		
		
	
			

