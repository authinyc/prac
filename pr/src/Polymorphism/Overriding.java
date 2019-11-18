package Polymorphism;

public class Overriding extends Overloading{
          
	  
		public void addition (int x,int y) {
			int z;
			z= x+y;
			System.out.println(z);
			
		}
		public void addition (int x) {
			int z = x;
			System.out.println(z);
		}

	}


