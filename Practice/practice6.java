package LearningJava;

public class practice6 {

	public static void main(String[] args) {
		
		int marks=40;
		
		if(marks>33&&marks<41)
		{
			System.out.println("You are just pass");
			
		}
		else if(marks>45&&marks<50)
		{
			System.out.println("You are third division pass");
		}
		
		else if (marks>50&&marks<60)
		{
			System.out.println("You are second division pass");
		}
		
		else if(marks>60&&marks<100)
		{
			System.out.println("You are first division pass");
		}
		
		else 
		{
			System.out.println("You are fail");

		}
	}

}
