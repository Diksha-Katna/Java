package LearningJava;

import java.util.Scanner;

public class Airthmetic_Exception {
	 	
	 	public static void main(String[] args)
	 	{
	 		
	 		System.out.println("The program has been started");
	 		
	 		Scanner scan =new Scanner(System.in);
	 		System.out.println("Enter Number");
	 		int num=scan.nextInt();
	 		
	 		try {
	 			
	 			int result=100/num;
	 			System.out.println("The result is :" +result);
	 		}
                
	 		
	 		catch(ArithmeticException e)
	 		{
	 			System.out.println("Not a valid Input");
	 			
	 		}
	 		
	 		
	 		
	 		
	 	}

}
