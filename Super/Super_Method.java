package LearningJava;


class Bio{
	
	void living()
	{
		System.out.println("This is BIO class Method");
	}
	
	
}

class zoo extends Bio{
	
	void living()
	{
		super.living();
		System.out.println("This is ZOO class Method");
	}
}
public class Super_Method {
	
	public static void main(String[] args) {
		
		zoo z = new zoo();
		z.living();
		
	}

}
