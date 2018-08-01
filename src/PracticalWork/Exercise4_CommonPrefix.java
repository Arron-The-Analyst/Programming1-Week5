package PracticalWork;
import java.util.Scanner;
public class Exercise4_CommonPrefix {

	public static void main(String[] args) {
	System.out.println("Welcome to the string prefix comparison program");
    Scanner input = new Scanner (System.in);
    System.out.println(" ");
do{ System.out.println("Please enter a string you would like to compare the prefix of");
    String a = input.nextLine();
    System.out.println(" ");
    System.out.println("Please enter another string that you would like to compare the prefix to");
    String b = input.nextLine();
    System.out.println(" ");   
    
   StringBuffer g = new StringBuffer();
   for(int i=0; i<(a.length()); i++) {
    char c = a.charAt(0);
    char d = b.charAt(0);
    char e = a.charAt(i);
    char f =b.charAt(i);
    
    if(c !=d) {System.out.println("These strings share no common prefix");
    	    break;}
    
    if(e==f) {g.append(e);}
     
     else { System.out.print("The common prefix your strings share is: ");
        	System.out.print(g);
        	break;}    
 }
   
}while(true); 

  }	
}

