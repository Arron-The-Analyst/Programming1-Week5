package PracticalWork;
import java.util.Scanner;
public class Exercise2_StringManipulationProgram {

	public static void main(String[] args) {
		System.out.println("Welcome to the Java String Manipulation Program.");
	    System.out.println("Firstly please enter the string that you wish to manipulate");
	
	do{	Scanner input = new Scanner(System.in);
	    String a = input.nextLine();
		
		System.out.println(" ");
		System.out.println("For the Repeat Method: Please press 1");
	    System.out.println("For the Intials Method: Please press 2");
	    System.out.println("For the Middle Name Method: Please press 3");
	    System.out.println("For the Reverse Method: Please press 4");
	    System.out.println("For the Dashes Method: Please press 5");
	    System.out.println("For the Password Method: Please press 6");
	    System.out.println("To Exit the Program: Please enter -1");
	    int b = input.nextInt();
	    System.out.println(" ");
	    
	    switch(b) {
	    case -1: System.out.println("You are now exiting the program");
	             System.exit(0);
	    
	    
	    case 1: System.out.println("Please enter the number of times you wish to repeat the string.");
	            int c = input.nextInt();
	            System.out.print("Your string now is: ");
	            for (int i=0; i<c; i++){
	            	System.out.print(a);
	            }
	            System.out.println(" ");
	            break;
	            
	    
	    case 2: if(a.contains(" ")){
	    	     int d = a.lastIndexOf(" ");
	    	     System.out.print("Your string now is: " + a.charAt(0) + "." +a.charAt(d+1));}
	     
	           else{System.out.println("You cannot use the Initials method on this string");}
	           break;
	    
	    case 3: if(a.contains(" ")){
	    	    int e= a.indexOf(" ");
	            int f=a.lastIndexOf(" ");
	            System.out.println("Your string now is: " + a.substring(e+1, f));}
	    
	            else{System.out.println("You cannot use the Middle Name method on this string");}
	    	    break;
	    	
	    case 4: 
	    	if(a.length()> 5 && a.length() <15){
	    			StringBuffer case4 = new StringBuffer();
	    			case4.append(a);
	    			case4.reverse();
	    			System.out.println("Your string now is: " + case4);}
	    	
	    	else{System.out.println("You cannot use the Reverse method on this string");}
	    	break;
	    			
	    case 5: 
	    	StringBuffer case5 = new StringBuffer();
	    	System.out.println("Your string now is: ");
	    	for(int i=0; i<a.length(); i++){
	    		char g = a.charAt(i);
	    		if(i == a.length()-1 || Character.isWhitespace(g)){
	            case5.append(g);}
	    		else{ case5.append(g + "-");}
	    	}
	    	System.out.print(case5);
	    	break;

	    case 6: 
	    int UpperLettercount = 0;
	    int LowerLettercount = 0;
	    int Numbercount = 0;
	    
	    for(int i = 0; i<a.length(); i++) {
	    	char h = a.charAt(i);
	    	
	    	if(a.contains(" ")|| a.length()<8) { 
	    		System.out.println("This String " + a + " is not a valid password"); 
	    		break;}
	    
	    	if(Character.isUpperCase(h)) {
	    		UpperLettercount++;
	    	}
	    	else if(Character.isLowerCase(h)) {
	    		LowerLettercount++;
	    	}
	    	else if(Character.isDigit(h)) {
	    		Numbercount++;
	    	}
	    }
	    
	    if(Numbercount >= 1){
	    	if(UpperLettercount >= 2){
	    		if(LowerLettercount >= 2){
	    			System.out.println("This String " + a + " is a valid password");}
	    		else{ System.out.println("This String " + a + " is not a valid password");}
	    	  }
	        }
	    break;
	  }
	    
	    System.out.println(" ");
	    System.out.println("Please enter the string that you wish to manipulate");
	}while(true); 
	
	
 }
}


