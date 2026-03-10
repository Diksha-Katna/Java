package LearningJava;

public class MainExceptionHandler {

	public static void main(String[] args) {
          
		try
		{
		int a[]=new int[3];
		System.out.println(a[5]);
		
		int result=100/0;
		}
		catch(Exception e)
		{
			System.out.println("Handled exception....");
			System.out.println(e.getMessage());
			
			
		}
	}

}
