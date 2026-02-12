package LearningJava;

public class Method_Overloading_Compile_Time_Polymorphism {
	
	int add(int a, int b)
	{
		return a+b;
		
	}
	int add(int a, int b, int c)
	{
		return a+b+c;
		
	}
	
	

	public static void main(String[] args) {
		Method_Overloading_Compile_Time_Polymorphism m1=new Method_Overloading_Compile_Time_Polymorphism();
		
		System.out.println(m1.add(5,5));
		System.out.println(m1.add(4,4,4));

		
		
	}
}
