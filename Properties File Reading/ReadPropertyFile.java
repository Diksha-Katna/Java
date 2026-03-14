package LearningJava;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;
public class ReadPropertyFile {
public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
		// Create a FileInputStream to read the properties file
		FileInputStream file=new FileInputStream("D:\\NewJAVA\\Myproperties.properties");
		
		 // Load the properties from the file
		prop.load(file);
		
		file.close(); // closing FileInputStream
		
		
		//Retrieve values using prop object
		
		/*String myname=prop.getProperty("name");
		String myemail=prop.getProperty("email");
		String myage=prop.getProperty("age");
		System.out.println(myname+"   "+myemail+"  "+myage);
		*/
		
		//Retrieves all the keys
		Set<String> allkeys=prop.stringPropertyNames();
		System.out.println(allkeys);  //[name, email, age]
		
		//Retrives all the values
		
		Collection <Object> values=prop.values();
		System.out.println(values); 
		
		
		//Reading keys and values using loop
		
		for(String key:prop.stringPropertyNames())
		{
			System.out.println(key+"  "+prop.getProperty(key));
		}
		
		
		
	}

}
