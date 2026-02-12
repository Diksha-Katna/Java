package LearningJava;

public class Class_And_Object {


	int id;
	String name;
	Double Salary;
	String Designation;
	
	
	void display()
	{
			System.out.println("The id is:" +id);
			System.out.println("The name is:" +name);
			System.out.println("The Salary is:" +Salary);
			System.out.println("The Designation is:" +Designation);
			
	}


public static void main(String[] args) {
	
	Class_And_Object s1=new Class_And_Object();
	s1.id=20;
	s1.name="Krishika";
	s1.Salary=100000.0;
	s1.Designation="Lead";
	
	s1.display();
	
	
			
}
}
