package LearningJava;


abstract class animaleats{
	
	
	public abstract void drinkwater();
	{
		
	}
	
	void veg()
	{
		System.out.println("Some animals eats VEG food only");
	}
}

class cat extends animaleats{
	
	public void drinkwater()
	{ 
		System.out.println(" Ohh CAT CAT CAT");
	}
}

public class Abstract_Class_Abstract_Method {
	
	public static void main(String[] args)
	{
		cat c1=new cat();
		c1.drinkwater();
		
		
	}

}
