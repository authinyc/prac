package Day6;

public class ArrayExercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {12,13,14,14,15,16,17,17};
		int l=x.length;
		
		for (int i=0;i<=l-1;i=i+1) {
			
			for (int j=i+1;j<l;j=j+1) {
				
				if ((x[i]==x[j]) && (i!=j)) {
					System.out.println(x[j]);
				}
				
			}
		}

	}

}
