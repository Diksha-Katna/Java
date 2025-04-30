package LearningJava;

import java.util.Arrays;

public class String_Method {

	public static void main(String[] args) {

		String Str= "Hello Java";
		String str2=Str.replace('H','0');
		System.out.println("The replaced String "+str2);
		String str3=Str.replace("Java", "JavaScript");
		System.out.println("The replaced String "+str3);
		String Words[]=Str.split(" ");
		System.out.println("The Split String is  "+Words[0]);
		System.out.println("The Split String is  "+Words[1]);
		System.out.println("The index of char "+Str.indexOf('J'));
		System.out.println("The Start with string  "+Str.startsWith("Hello"));
		System.out.println("The Ends with string  "+Str.endsWith("Java"));
		
		String st="";
		System.out.println("The Length of string is " +st.length());
		System.out.println("The Empty string is  " +st.isEmpty());
		
		char[] ch=Str.toCharArray();
		System.out.println(ch);
		System.out.println(Arrays.toString(ch));
		


	
		
		
	}

}
