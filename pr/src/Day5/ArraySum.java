package Day5;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x;
		x =new int [8];
		x[0] =10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		x[4]=50;
		x[5]=60;
		x[6]=70;
		x[7]=80;
		int l=x.length;
		int sum=0;
		
		
		for (int i=0;i<=l-1;i=i+1) {
			sum = sum+x[i];
			
		}
		System.out.println(sum);
		

	}

}
