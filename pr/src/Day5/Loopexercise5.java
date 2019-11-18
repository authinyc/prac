package Day5;

public class Loopexercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 20; i <= 60; i = i + 1) {
			if (i % 6 == 0) {
				sum = sum + i;
			}

		}
		System.out.println(sum);

	}

}
