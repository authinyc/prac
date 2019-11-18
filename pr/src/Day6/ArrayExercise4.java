package Day6;

public class ArrayExercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,2,2,4,5,6,6};
		
		int[] temp = new int[x.length];
		int j=0;
		
		
		for(int i =0;i<x.length-1;i=i+1) {
			
			if(x[i]!=x[i+1]) {
					temp[j]=x[i];
					j++;
				}
				
			}
		         temp[j] = x[x.length-1];
		         for(int i=0;i<x.length;i=i+1) {
		        	 System.out.println(temp[i]);
		         
			
			
		}

	}

}
