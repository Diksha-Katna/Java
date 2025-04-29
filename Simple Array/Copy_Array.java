package LearningJava;

import java.util.Arrays;

public class Copy_Array {

	public static void main(String[] args) {

		int a[]= {2,4,6,8,10};
		
		int b[]=Arrays.copyOf(a,a.length);
		System.out.println("Copied Array: " +Arrays.toString(b));
		
		
	}

}
