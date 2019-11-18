package Collection;

import java.util.ArrayList;
import java.util.ListIterator;


public class C {

	//private static final String Listiterator<String>itr  = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>alist = new ArrayList<String>();
		alist.add("Hasan");
		alist.add("Karim");
		alist.add("Towhid");
		alist.add("Alif");
		
			ListIterator<String>itr = alist.listIterator();
			
			while(itr.hasNext()) {
				String x=itr.next();
			
		
		if (x.equals("Karim")) {
			itr.remove();
			itr.add("Obama");
			

	}}
			for(String x:alist) {
				System.out.println(x);
			}

		}
		}

