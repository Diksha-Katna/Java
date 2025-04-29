package LearningJava;

import java.util.Arrays;

public class Compare_Array {

	public static void main(String[] args) {
            int a[]= {2,6,8,10};
            int b[]= {10,12,14,8};
            
            
            boolean result=Arrays.equals(a, b);
            System.out.println(result);
	}

}
