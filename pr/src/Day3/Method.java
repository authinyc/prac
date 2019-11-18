package Day3;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Method a=new Method();
        
		
		a.Addition (8,9);
        a.Addition (7,6);
             int x=Substraction (10,20);
             System.out.println(x);

             
	}
	      public void Addition (int x,int y) {
	      int z=x+y;
	      System.out.println(z);
	      }
	
	      public static int Substraction (int x,int y) {
	    	  int z=x+y;
	    	  return z;
	    	  
	      }
	      
	      
}