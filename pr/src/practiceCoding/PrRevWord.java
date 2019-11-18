package practiceCoding;

public class PrRevWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String st = "Welcome to Selenium";
       String[] words = st.split(" ");
       String reverse = words[2]+" "+words[1]+" "+words[0];
       System.out.println(reverse);
	}

}
