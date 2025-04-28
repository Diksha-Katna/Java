package LearningJava;

public class Largest_Numbers_In_Array {

	public static void main(String[] args) {

		int a[]= new int[5];
		int max=a[0];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=50;
		
		for(int i=0;i<=4;i++)
		 
		{
			if(max<a[i]) {
				
				max=a[i]; 
				
			}
		
			
		}
		System.out.println(max); 
	}

}
