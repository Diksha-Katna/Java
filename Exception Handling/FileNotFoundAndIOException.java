package LearningJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundAndIOException {

	public static void main(String[] args) {
		
		try
		{
		 FileReader file = new FileReader("C:\\Users\\diksh\\OneDrive\\Documents\\Automation.txt");
		 System.out.println(new BufferedReader(file).readLine());
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found ");
		}
		catch(IOException e)
		{
			System.out.println("Input Output Exception");
		}
		
		

	}

}
