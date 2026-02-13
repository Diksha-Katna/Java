package LearningJava;

class animalfamily
{
	
	void family()
      {
	    System.out.println("This is animal family");
      }
	
}

class dog extends animalfamily
{
	void dogbark()
	
	{
		System.out.println("The dog barks");
	}
	
}

public class Single_level_Inheritence {
	
	public static void main(String[] args)
	{
		
		dog d=new dog();
		d.family();
		d.dogbark();
		
	}

}
