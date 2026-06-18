package LearningJava;

public class practice16 {

	public static void main(String[] args) {
		int num=713,last_digit,sum=0;
		while(num!=0)
		{
			last_digit=num%10;
			sum=sum+last_digit;
			num=num/10;
			
			
		}
		System.out.println(sum);
		
	}

}
