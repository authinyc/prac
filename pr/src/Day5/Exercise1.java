package Day5;

public class Exercise1 {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1 x=new Exercise1();
		
		boolean a=x.GreatNumber(7,1);
		System.out.println(a);
		Exercise1 y=new Exercise1();
		boolean b=y.GreatNumber(3, 4);
		System.out.println(b);
		Exercise1 z=new Exercise1();
		boolean c=z.GreatNumber(13,6);
		System.out.println(c);
		Exercise1 n=new Exercise1();
		boolean d=n.GreatNumber(1,5);
		System.out.println(d);
		
		
	
				
	}
	
		public boolean GreatNumber(int a,int b){
			boolean r=false;
			if(a==7||b==7) {
				r=true;
		}
			else if(a+b==7) {
				r=true;}
			else if(a-b==7){
				r=true;
			}
			return r;
     
		
    	 
    	 
     }
      {
    	
     }
      {
    	 
     }
      {
    	 
     }
     
	}

     
	

	
	
		
	
		
	
 


