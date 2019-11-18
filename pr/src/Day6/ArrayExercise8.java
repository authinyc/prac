package Day6;

public class ArrayExercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {10,21,303,50,34,409,20,11,33,100};
		int l = x.length;
		for(int i=0;i<=l-1;i=i+1) {
			
			if (x[i]%2==1) {
				System.out.println(x[i]);
			}
		}

	}

}
