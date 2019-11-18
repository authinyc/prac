package Day1;

public class Practice2 {
	    int x;
		int y;
		public Practice2(int i,int j) {
			x = i;
			y = j;
			
		}
		public void swipe() {
			x = x+y;
			y = x-y;
			x = x-y;
		}
		public static void main(String[] args) {
			Practice2 a = new Practice2(10,20);
			a.swipe();
			System.out.println(a.x);
			System.out.println(a.y);
		}
		

	}


