package LearningJava;

class person{
	
	String name;
	
	person(String na){
		this.name=na;
	}
	
	void display()
	{
		System.out.println("The name of person is :" +name);
	}
}

public class this_keyword {
               
	public static void main(String[] args) {
		
		person p1=new person("Diksha Katna");
		p1.display();
	}
}
