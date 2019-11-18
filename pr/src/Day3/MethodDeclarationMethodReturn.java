package Day3;

public class MethodDeclarationMethodReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = Asterisk(6,9);
		System.out.println(r);
		int t = Asterisk(9,9);
		System.out.println(t);
	}
	public static int Asterisk (int x,int y) {
		int z=x*y;
	return z;
	}

}
