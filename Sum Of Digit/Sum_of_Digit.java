package LearningJava;

public class Sum_of_Digit {

	public static void main(String[] args) {
	
		int number=567,sum=0;
		
		          while(number!=0)
		           {
		           int  last_digit =number%10;
		           sum=sum+last_digit;
		           number=number/10;
		           
		           }
		           
		           System.out.println(sum);
		           
		           

	}

}
