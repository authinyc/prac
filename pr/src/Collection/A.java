package Collection;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>alist = new ArrayList<String>();
		alist.add("Shobuz");
		alist.add("Saif");
		alist.add("Syful");
		alist.add("Shobuz");
		alist.add("Authi");
		
		
		
		for(String s: alist) {
			System.out.println(s);
			
		}
		
		System.out.println("================");
		
		alist.remove("Shobuz");
		alist.remove("Saif");
		
		for(String s: alist) {
			System.out.println(s);
			int y = s.length();
			System.out.println(y);
		}
		System.out.println("=============");
		alist.get(0);
		String s = alist.get(0);
		System.out.println(s);
		int x = alist.size();
		System.out.println(x);
		
		
		

	}
	
	
	

}
