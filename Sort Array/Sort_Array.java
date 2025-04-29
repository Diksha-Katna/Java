package LearningJava;

import java.util.Arrays;
import java.util.Collections;

public class Sort_Array {

	public static void main(String[] args) {
        //Sorting in Ascending Order
		int a[]= {3,8,16,9,30};
		System.out.println("Before Sorting "+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sorting "+ Arrays.toString(a));
		
		//Sorting String in Ascending Order
		
		String s[]= {"Lalita","Renu","Mahima","Vishakha"};
		System.out.println("Before Sorting "+ Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("After Sorting "+ Arrays.toString(s));
		
		
		//Sorting in descending order
		Integer b[]= {13,8,6,90,30};
		System.out.println("Before Sorting "+ Arrays.toString(b));
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println("After Sorting "+ Arrays.toString(b));
		
	}

}
