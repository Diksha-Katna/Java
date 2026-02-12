package LearningJava;

public class Static_Variable_Static_Method {

	static int a=10;
	int b=20;
	
	static void fun()
	{
		System.out.println("This is static method");
		
	}
	
	void fun2() 
	{
		System.out.println("This is normal method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("The value of static variable a is:" +a);
		fun();
		
		Static_Variable_Static_Method s1= new Static_Variable_Static_Method();
		
		System.out.println(s1.b);
		s1.fun2();
		
		
	}
}
