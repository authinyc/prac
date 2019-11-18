package Day1;
  

public class Practice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
exercise(4);		
		
exercise(74);		
	}
	
	public static int exercise(int z) {
		int [] x = {2,5,7,74,80};
		boolean b=false;
		int l = x.length;
		for (int i=0;i<=l-1;i++) {
			
			if(x[i]==z) {
				
				System.out.println("Exsists");
				b=true;
				break;
			}	
		}
		if(b==false) {
			System.out.println("Not Exists.");
		}
		
		
		
		return z;

}
}
