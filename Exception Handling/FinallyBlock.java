package LearningJava;

public class FinallyBlock {

	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		
		try
		{
			int result=num1/num2;
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Hnadled exceptoin successfully.....");
		}
		finally
		{
			System.out.println("Entered into finally block......");
		}

	}

}
