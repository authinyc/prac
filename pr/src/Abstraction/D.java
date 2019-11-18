package Abstraction;
  class D extends A {

	public void addition(int x, int y) {
		int z =x+y;
		System.out.println(z);

	}
	public static void main (String[] args) {
		D d = new D();
		d.addition(10, 20);
	}

}
