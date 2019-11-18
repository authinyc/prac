package Day6;

public class ArrayExercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {10,21,303,50,34,409,20,11,33,100};
		int max = x[0];
		
		for(int i=0;i<x.length;i=i+1) {
			if(max<x[i]) {
				max=x[i];
			}
		}
		System.out.println(max);

	}

}
