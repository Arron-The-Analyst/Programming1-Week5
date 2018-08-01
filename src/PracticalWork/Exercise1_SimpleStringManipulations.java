package PracticalWork;

public class Exercise1_SimpleStringManipulations {

	public static void main(String[] args) {
		String a = "Java is an Object Oriented programming language";
		
		System.out.println(a);
		System.out.println(" ");
		
		System.out.println(a.toUpperCase());
		System.out.println(" ");
		
		System.out.println(a.toLowerCase());
		System.out.println(" ");
		
	   
		StringBuilder input = new StringBuilder();
		StringBuilder output = new StringBuilder();
		input.append(a);
			
		for(int i =0; i< input.length(); i++){
			char index = input.charAt(i);
			
			if(Character.isUpperCase(index)){
				input.setCharAt(i, Character.toLowerCase(index));}
			
			else{input.setCharAt(i, Character.toUpperCase(index));}
		}
		output.append(input);
		System.out.println(output);
		System.out.println(" ");
			
		System.out.println("The length of the string is: " + a.length());
		System.out.println(" ");
		
		System.out.println(a.replaceAll(" ", ""));
		System.out.println(" ");
		
		System.out.println("The index of the word Oriented is: " +a.indexOf("Oriented"));
		System.out.println(" ");
		
		

	}

}
