package Day1;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "H1C21F1D1";
		int count = 0;
		for(int x=0;x<s.length();x++) {
			char c = s.charAt(x);
			if(c=='1') {
				count = count +1;
			}
		}
		System.out.println(count);

	}

}
