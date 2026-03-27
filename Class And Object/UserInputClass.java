package LearningJava;

import java.util.Scanner;

public class UserInputClass {

	int age;
	int rollno;
	
	void getdata()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age");		
		age=scan.nextInt();
		System.out.println("Enter RollNo");
		rollno=scan.nextInt();
		
				
	}
	
	void showvalues()
	{
		System.out.println("The age is:" +age);
		System.out.println("The rollno is:" +rollno);
		
		
	}
	
public static void main(String[] args) {
		
		UserInputClass s1= new UserInputClass();
		s1.getdata();
		s1.showvalues();
}

}
