package LearningJava;

class animalhome{
	
	void forest()
	{
		System.out.println("All animals live here");
	}
}


class dogs extends animalhome{
	
	void dogeats()
	{
		System.out.println("The dog eats eggs");
	}
}

class puppies extends dogs{
	
	void puppydrinks()
	{
		System.out.println("The puppies drink milk");
	}
}
public class Multi_level_Inheritence {
	
	public static void main(String[] args) {
		
		puppies p1=new puppies();
		p1.forest();
		p1.dogeats();
		p1.puppydrinks();
		
	}

}
