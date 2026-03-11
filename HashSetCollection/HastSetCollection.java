package LearningJava;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HastSetCollection {

	public static void main(String[] args) {
		
		//Set myset=new HashSet();  // generic
				//Set <String> myset=new HashSet<String>(); //specific
				
				HashSet myset=new HashSet();
				
				//Adding elements
				
				myset.add(100);   //Integer
				myset.add(10.5); //Double
				myset.add("Welcome");  //String
				myset.add(true);
				myset.add('A');
				myset.add(null);
				myset.add(100);   //Duplicate
				myset.add(null);
				
				//size of HashSet
				
				System.out.println("Size is:"+myset.size()); //6
				
				//printing - insertion order not preserved
				System.out.println("Elements in HashSet:"+ myset); //[null, A, 100, 10.5, Welcome, true]
				
				//remove element
				myset.remove(10.5); // 10.5 is a value, not index..
				System.out.println("HshSet elements after removing:"+ myset);//[null, A, 100, Welcome, true]
				
				//Insert element  - Not possible to insert element. Indexing not supported.
				
				//Access specific element - Not possible, Index not support
				
				
				//We can access specific element in different way.
				ArrayList mylist=new ArrayList(myset);
				System.out.println("Elements in ArrayList:"+mylist); //[null, A, 100, Welcome, true]
				System.out.println("The element present in 3rd position:"+ mylist.get(3)); //Welcome
				
				//converting back to Set
				//Set myset1=new HashSet(mylist);
				//System.out.println(myset1);
				
				
				//read data using for..each loop
				/*System.out.println("Reading data using for..each loop....");
				for(Object element:myset)
				{
					System.out.println(element);
				}
				*/
				
				//read data using Iterator
				
				System.out.println("Reading data using Iterator.......");
				Iterator itr=myset.iterator();
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				
				//clearing
				
				myset.clear();
				System.out.println("After clearing:"+ myset); //[]
				
				//Checking if HashSet is empty.
				
				System.out.println("Is HashSet empty?"+myset.isEmpty()); //true
				
				
	}

}
