package Abstraction;

abstract class Animal{
                  int x =10;  
                  int y =20;
	
	public static int legs(int x) {
		int z= x;
		return z;
		
		}
	public Animal(){
		
		int z = 20;
		System.out.println(z);
	}
	
	abstract void eat();
	
	
	
   public static void walk(int x,int y) {
	   
	   int z = x+y;
	   System.out.println(z); 

   }

	
}


