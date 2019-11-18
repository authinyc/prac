package Day4;

public class Constructor {
	int id;
	int ph;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor s1 = new Constructor(10, 123456);
		s1.display();
//		int v=s1.ph;
//		System.out.println(v);
		Constructor s2 = new Constructor(20, 234567);
		s2.display();
//        int l=s2.ph;
//        System.out.println(l);
	}

	public Constructor(int x, int y) {
		id = x;
		ph = y;
	}

	public void display() {
		System.out.println(id);
		System.out.println(ph);

	}

}
