package LearningJava;

public class String_Comparison {

	public static void main(String[] args) {

		String s1="welcome";   //This will store in Pool Memory
		String s2="welcome";   //This will store in Pool Memory
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		String  s3=new String("Hello"); //This will store  in heap memory
		String s4=new String("Hello");  //This will store  in heap memory
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
		String  s5=new String("Java").intern(); // Here Converting heap memory into pool memory
		String s6=new String("Java").intern();  // Here Converting heap memory into pool memory
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
	}

}
