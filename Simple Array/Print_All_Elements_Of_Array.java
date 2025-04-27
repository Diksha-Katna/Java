package LearningJava;

public class Print_All_Elements_Of_Array {

	public static void main(String[] args) {
		 int a[]=new int[5];
		 a[0]=1;
		 a[1]=2;
		 a[2]=3;
		 a[3]=4;
		 a[4]=5;
		 
		 System.out.println("The length of array is:" +a.length);
		 
		 for(int i=0;i<=4;i++)
		 {
			 System.out.println(a[i]);
		 }

	}

}
