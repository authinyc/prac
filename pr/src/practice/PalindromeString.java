package practice;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	String given = "MADAM";
	String result ="";
	for (int i = given.length()-1;i>=0;i--) {
		result = result + given.charAt(i);
		
	}
	if (given.equals(result)) {
		System.out.println("It is a Palindrome");}
	
	else {
		
		System.out.println("It is not a Palindrome");
		
	}
    	 
    	 
    	 
    	 
     
     
     
     
     
     
}}

