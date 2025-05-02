package LearningJava;

public class String_Buffer_Method {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Hello");
		s.append("World");
		System.out.println(s);
		
		s.insert(5, ",");
		System.out.println(s);
		
		s.replace(5,6, "!");
		System.out.println(s);
		
		s.delete(5, 6);
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		

	}

}
