package Day1;

public class practice5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String ("It is a book");
		
		String[] z = s.split(" ");
		
		for(int i=0;i<z.length;i++) {
			
		
			if (z[i].length()>2) {
				for(int j = z[i].length()-1;j>=0;j--) {
					System.out.println(z[i].charAt(j));
			}
			}}
		
		
		
		
		

	}

	
	}

	



