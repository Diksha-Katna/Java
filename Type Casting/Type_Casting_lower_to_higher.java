package LearningJava;

public class Type_Casting_lower_to_higher {

	public static void main(String[] args) {
		
		
		//Widening Example
		//byte>short>int>long>float>double
		
		byte b=100;
		short s=b;
		int i=s;
		long l=i;
		float f=l;
		double d=f;
		
		System.out.println("Byte Value:"+b);
		System.out.println("Short Value:"+s);
		System.out.println("Int Value:"+i);
		System.out.println("Float Value:"+f);
		System.out.println("Double Value:"+d);
		
	}

}
