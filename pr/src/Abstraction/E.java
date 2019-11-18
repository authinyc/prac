package Abstraction;

public class E implements B {
	public void addition(int x,int y) {
		int z = x+y;
		System.out.println(z);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e = new E();
		e.addition(6, 7);

	}

}
