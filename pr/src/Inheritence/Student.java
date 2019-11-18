package Inheritence;

public class Student {
	String FirstName;
	String LastName;
	int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student s1 = new Student ("Donald","Trump",70);
	s1.display();
	Student s2 = new Student ("Syful","Islam",23);
	s2.display();
	Student s3 = new Student ("Arafat","Rahman",29);
	s3.display();
	}
	
	
	
	



	
	public Student(String x,String y,int a) {
		FirstName=x;
		LastName=y;
		age=a;
		}
	public void display() {
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(age);
		
	}
}
