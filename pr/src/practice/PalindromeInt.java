package practice;

public class PalindromeInt {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
          int i = 121;
          int n = i;
          int r = 0;
          int p = 0;
          while(n!=0) {
        	  r = n%10;
        	  p = p*10 + r;
        	  n = n/10;
        	  }
          if(i==p) {
        	  System.out.println("It is a Palindrome");}
        	  else {
        		  System.out.println("It is not a Palindrome");
        	  }
          }
          
	}

