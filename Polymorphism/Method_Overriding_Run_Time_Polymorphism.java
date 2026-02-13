package LearningJava;

class animalsound{
	
 void sound()
	{
		System.out.println("Each animal has different sound");
	}
}


class dogsound extends animalsound{
	
		void sound()
		{
			System.out.println("This is dog sound");
		}
	}


public class Method_Overriding_Run_Time_Polymorphism {
	
	public static void main(String[] args)
	{
		
		dogsound ds1= new dogsound();
		ds1.sound();
		
	}
	

}
