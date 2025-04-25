package LearningJava;

public class Prime_Numbers {

	public static void main(String[] args) {
		
		int num=3,count=0,i;
		
		for(i=1;i<=num;i++)
		{
			if (num%i==0)
				count++;
		}
		
		if(count==2)
			System.out.println("The number is prime");
		else 
			System.out.println("The number is not  prime");
				

	}

}
