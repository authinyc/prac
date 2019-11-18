package Day6;

public class StringExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String ("How are you?");
		int l = a.length();
		
		
		for(int i=0;i<=l-1;i=i+1) {
			char s=a.charAt (i);
			System.out.println(s);
			
		}
		

	}

}
