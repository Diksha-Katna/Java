package LearningJava;

import java.io.File;

public class SimpleFolderCreate {

	public static void main(String[] args) {
		
		File folder=new File("D:\\LearnJava");
		
		if(!folder.exists())
		{
			folder.mkdir();
			System.out.println("Folder Created Successfully," +folder.getName());
		}
		else
			
		{
			System.out.println("Folder Name Already Exist");
		}
		

		
		
		
	}
	
	

}
