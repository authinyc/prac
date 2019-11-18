package practice;

public class SR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String st = "Selenium";
       int len = st.length();
       String rev = "";
       for(int i=len-1;i>=0;i--) {
    	   rev = rev + st.charAt(i);
    	   
       }
       System.out.println(rev);
		
		
		
	}

}
