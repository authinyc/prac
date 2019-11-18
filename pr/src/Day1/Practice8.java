package Day1;

public class Practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1238;
		int sum = 0; 
		while (i!=0) {
			sum=sum+i%10;
			i=i/10;
		}
          System.out.println(sum);
	}

}
