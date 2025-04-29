package LearningJava;

import java.util.Arrays;

public class Object_Type_Array {

	public static void main(String[] args) {

		Object o[]=new Object[5];
		
		o[0] ="Welcome";
		o[1] =1;
		o[2] =10.5;
		o[3] =true;
		o[4] ='A';
		
		System.out.println(o[2]);
		System.out.println(o[2].getClass().getSimpleName()); //To know the Type
		System.out.println(o[4]);
		System.out.println(o[4].getClass().getSimpleName());
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(o[i]);
		}
	
	    //Read Array without using loop
		
		System.out.println(Arrays.toString(o));
	}
	
	
	

}
