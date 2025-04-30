package LearningJava;

public class String_Methods {

	public static void main(String[] args) {

		String s1="    Welcome    ";
		System.out.println("The length of string is:" +s1.length());
		
		String s2="Bye";
		int a=s2.length();
		System.out.println("The length of string is:" +a);
		
		String s3="Hello";
		System.out.println("The character at position 2 is " +s3.charAt(0));
		
		String s4="Java";
		char c=s4.charAt(2);
		System.out.println("The character at position :" +c);
		
		String s5="Capital Delhi";
		String sh=s5.substring(4);
		System.out.println("The substring is " +sh);
		
		String st=s5.substring(3,8);
		System.out.println("The substring is " +st);
		
		Boolean B=s5.contains("Delhi");
		System.out.println("The String Contains " +B);
		
		System.out.println(s4.equals(s5));
		
		String s6="JAVA";
		System.out.println(s4.equalsIgnoreCase(s6));
		
		System.out.println(s6.toLowerCase());

		System.out.println(s6.toUpperCase());
		System.out.println(s1.trim());

}
}