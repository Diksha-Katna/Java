package LearningJava;

public class StringNullException {

	public static void main(String[] args) {

		String s=null;
		
		try
		{
			System.out.println("The Length of string is :" +s.length());
			
		}
		
		catch(NullPointerException e)
		{
			System.out.println("You can not apply method on null");
			
		}
		
		
	}

}
