package Collection;

import java.util.HashSet;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>alist=new HashSet<String>();
		alist.add("Shobuj");
		alist.add("Saif");
		alist.add("Syful");
		alist.add("Shobuj");
		alist.add("Authi");
		
		for(String s:alist) {
			System.out.println(s);
			int y = s.length();
			System.out.println(y);
		}
		alist.remove("Shobuj");
		alist.remove("Syful");
		
		for(String s:alist) {
			System.out.println(s);

	}
		
	}
}



