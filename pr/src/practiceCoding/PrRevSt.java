package practiceCoding;

public class PrRevSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "Selenium";
		String rev = "";
		int len = st.length();
		for(int i=len-1;i>=0;i--) {
			rev = rev + st.charAt(i);
		}
		System.out.println(rev);

	}

}
