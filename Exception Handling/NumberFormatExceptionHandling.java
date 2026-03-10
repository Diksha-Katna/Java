package LearningJava;
import java.util.Scanner;

public class NumberFormatExceptionHandling {
	  



		public static void main(String[] args) {

			Scanner scan =new Scanner(System.in);
			
			System.out.println(" Enter String");
			String value=scan.nextLine();
			
			try {
				int valueInt=Integer.parseInt(value);
				System.out.println(valueInt);		
						
				
				
			}
			
			catch(NumberFormatException e)
			{
				System.out.println("Not a valid Input");
			}
		
			
			
		
		}
	

}

