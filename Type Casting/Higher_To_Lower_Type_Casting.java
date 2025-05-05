package LearningJava;

public class Higher_To_Lower_Type_Casting {

	public static void main(String[] args) {
		//Narrowing Data Type
		
		double d=9.12343434;
		float f=(float)d;
		long l=(long)f;
		int i=(int)l;
		short s=(short)i;
		byte b=(byte)s;
		
		System.out.println("Byte Value:"+b);
		System.out.println("Short Value:"+s);
		System.out.println("Int Value:"+i);
		System.out.println("Float Value:"+f);
		System.out.println("Double Value:"+d);
		

	}

}
