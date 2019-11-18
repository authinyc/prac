package Day1;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String ("We are doing java");
		String [] z = s.split(" ");
		
		for (int i=0;i<z.length;i++) {
		//	System.out.println(z[i]);
		
		for (int j=z[i].length()-1;j>=0;j--) {
			System.out.print(z[i].charAt(j));
		}
		System.out.println();
			
		}

	}
}
	


