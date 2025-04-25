package LearningJava;

public class Sum_of_Odd_Numbers {

	public static void main(String[] args) {
		
		int i,sum=0;
		
		for(i=1;i<=100;i++)
			
		{
			
			if(i%2!=0)
			{
				sum=sum+i;
				
				
			}
			
		}
		System.out.println(sum);
	}

}
