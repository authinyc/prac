package Polymorphism;

public class Overloading {
          
	public void addition (int x,int y) {
		int z;
		z=x+y;
		System.out.println(z);
	}
	public void addition () {
		int z;
		z = 30+10;
		System.out.println(z);
	}
	public void addition(String x, String y) {
		String z = x+y;
		System.out.println(z);
	}

}
