package practice;

import java.lang.reflect.Method;

public class GFG {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		 Check c = new Check(); 
		  
	        // Using getDeclareMethod() method 
	        Method m = Check.class.getDeclaredMethod("private_Method"); 
	  
	        // Using setAccessible() method 
	        m.setAccessible(true); 
	  
	        // Using invoke() method 
	        m.invoke(c); 
	        Method l = Check.class.getDeclaredMethod("printData");
	        l.setAccessible(true);
	        l.invoke(c);
	    } 
	}


