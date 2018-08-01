package PracticalWork;

import java.util.Scanner;
public class Exercise5_Anagram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Anagram program");
		System.out.println(" ");
	do{	System.out.println("Please enter your first string");
		String a = input.nextLine();
		System.out.println(" ");
		System.out.println("Please enter your second string you would like to compare it too");
		String b = input.nextLine();
		System.out.println(" ");
	
		
		if (a.contains(" ") || b.contains(" ")) {
			a.replaceAll(" ", "");
			b.replaceAll(" ", "");}
		
				
		for(int i =0; i<a.length(); i++){
		    char c =a.charAt(i);
		    char d =a.charAt(i);
			
		    if(Character.isUpperCase(c)|| Character.isUpperCase(d)){
				a.toLowerCase();
				b.toLowerCase();
			}
		}
			
		int e = a.compareTo(b);
			if(e<0) {System.out.println("These strings are anagrams of one another");}
			else {System.out.println("These strings are not anagrams of each other");}
	System.out.println(" ");
	}while(true);		
	}
			
		}
	


