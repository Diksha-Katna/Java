package LearningJava;

public class practice14 {

	public static void main(String[] args) {

		int i,num=3,count=0;
		for(i=1;i<=num;i++) {
			if(num%i==0)
			{
				count++;
			}
			
			if(count==2)
			{
				System.out.println("The number is odd");
			}
		}
		
	}

}
