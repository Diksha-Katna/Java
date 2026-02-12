package LearningJava;

import java.util.Scanner;

public class User_Input_Class_Object {
	
	int age;
	String name;
	
	void getdata()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Age");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		name=sc.nextLine();
	}

	void showdata()
	{
		System.out.println("Age is:" +age);
		System.out.println("Name is:" +name);
	}
	
	public static void main(String[] args) {
		User_Input_Class_Object u1=new User_Input_Class_Object();
		u1.getdata();
		u1.showdata();
		
	}
}


