package LearningJava;

public class Total_Odd_Numbers {

	public static void main(String[] args) {

		int i,count=0;
		for(i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				count++;
			}
			
			
		}
		System.out.println("Total odd numbers are :" +count);
	}

}
