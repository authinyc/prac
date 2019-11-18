package Day1;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Today is sunny day";
		int counter = 0;
		for( int i =0;i<s.length();i++) {
			
			if (s.charAt(i)=='d') {
				counter++;
			}
				
	}
               System.out.println(counter);
}
}