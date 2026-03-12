package LearningJava;

public class Continue_Statement {

	public static void main(String[] args) {
		
		int i;
		for(i=1;i<=10;i++)
		{
			if(i==7)
			{
				continue;
			}
			
			System.out.println(i);
		}

	}

}
