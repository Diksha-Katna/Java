package LearningJava;

public class Another_class_object {

	
	int age;
	int rollno;
	
	
	void setvalues(int ag, int no)
	{
		age=ag;
		rollno=no;
		
	}
	
	void showvalues()
	{
		System.out.println("The age is:" +age);
		System.out.println("The rollno is:" +rollno);
		
		
	}
	
	public static void main(String[] args) {
		
		Another_class_object a1=new Another_class_object();
		a1.setvalues(2,10);
		a1.showvalues();
	}
}
