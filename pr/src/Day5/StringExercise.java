package Day5;

public class StringExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String ("We are learning Java");
		int l=s.length();
		System.out.println(l);
		char c =s.charAt(0);
		System.out.println(c);
		String t=s.substring(7);
		System.out.println(t);
		String d = s.substring(7, 15);
		System.out.println(d);
		boolean b=t.equals(d);
		System.out.println(b);
		
		for(int i=0;i<=l-1;i=i+1) {
			char a = s.charAt(i);
			System.out.println(a);
			
		}

	}

}
