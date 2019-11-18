package Day5;

public class Employee {
	int SSN;
	String Name;
	double salary;
	static int counter;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s1 = new Employee(12345,"Donald Trump",10000);
		s1.display();
		Employee s2 = new Employee(2345,"Alam Hossain",20000);
		s2.display();
		Employee s3 = new Employee(3456,"Gulam kabir",25000);
		s3.display();
		
		s1.display();
		
		
		
		}
		public Employee (int x,String n,double a) {
		SSN=x;
		Name=n;
		salary=a;
		counter++;
		
        
	}
		public double calculatebonus() {
			double bonus;
			bonus=salary+salary*(.10);
			return bonus;
		}
		public void display() {
			System.out.println(SSN);
			System.out.println(Name);
			double d=calculatebonus();
			System.out.println(d);
			System.out.println(counter);
		}
		
		
		
		

}
