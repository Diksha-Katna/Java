package LearningJava;

public class MultipleCatch {

	public static void main(String[] args) {
		
		try
		{
		int a[]=new int[3];
		System.out.println(a[5]);
		
		int result=100/2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled Arithmetic exception....");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handled ArrayIndexOutOfBoundsException....");
		}
		
		

	}

}
