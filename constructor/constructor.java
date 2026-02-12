package LearningJava;

public class constructor {
	int age;
	int rollno;
	
	
	constructor(int ag, int rn)
	{
		age=ag;
		rollno=rn;
		
	}
	
	void showvalues()
	{
		System.out.println("The age is:" +age);
		System.out.println("The rollno is:" +rollno);
		
		
	}
	
	public static void main(String[] args) {
		
		constructor c1=new constructor(80,200);
	
		c1.showvalues();
	}
}



