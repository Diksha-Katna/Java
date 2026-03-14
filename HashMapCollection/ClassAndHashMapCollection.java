package LearningJava;
import java.util.HashMap;
class Book
{
	int id;
	String name,author;
	int qty;
	
	Book(int id, String name, String author,int qty)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.qty=qty;
	}
	
}

public class ClassAndHashMapCollection {
public static void main(String[] args) {
		
		Book b1=new Book(101,"Java Programming","Smith",2);
		Book b2=new Book(102,"Python Programming","Scott",3);
		Book b3=new Book(103,"C# Programming","David",1);
		
		HashMap <Integer,Book> hm=new HashMap<Integer,Book>();
		
		hm.put(1,b1);
		hm.put(2,b2);
		hm.put(3,b3);
		
		for(Integer key:hm.keySet())
		{
			Integer id=hm.get(key).id;
			String author=hm.get(key).author;
			String name=hm.get(key).name;
			Integer qty=hm.get(key).qty;
			
			System.out.println(key+"   "+id+"  "+author+"  "+name+"   "+qty);
		}
		
		//Using Iterator - you can try

	}
}
