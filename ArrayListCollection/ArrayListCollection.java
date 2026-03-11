package LearningJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ArrayListCollection {

	public static void main(String[] args) {
		//ArrayList myList=new ArrayList(); //Generic
				List myList=new ArrayList();   //Generic
				//ArrayList <String> myList=new ArrayList<String>();
				
				
				//Adding various types data
				
				myList.add(100);   // Integer
				myList.add(10.5); //Double
				myList.add("Welcome");  //String
				myList.add('A');  //Character
				myList.add(true);  //Boolean
				myList.add(100);  //Integer
				myList.add(null);
				myList.add(null);
				
				//Finding Size
				System.out.println("Size of array list:"+ myList.size()); 
				
				//Printing arraylist
				System.out.println("ArrayList elements:"+ myList); 
				
				//Remove an element
				
				myList.remove(5);   // 5 is an index of the element
				System.out.println("After removing ArrayList elements:"+ myList);
				
				//inserting
				myList.add(2,"java");
				System.out.println("After inserting ArrayList element:"+ myList); 
				
				//modification
				myList.set(2, "Python");
				System.out.println("After modification ArrayList element:"+ myList); 
				
				//access specific element
				System.out.println("Element at index 3:"+myList.get(3)); //Welcome
				
				//1. read elements using normal for loop
				/*
				System.out.println("Getting data using normal for loop......");
				for(int i=0; i<myList.size();i++)
				{
					System.out.println(myList.get(i));
				}
				*/
				//2. read elements using for..each loop
				/*System.out.println("Getting data using for..each loop......");
				
				for(Object element:myList)
				{
					System.out.println(element);
				}
				*/
				
				//3. read elements using Iterator
				
				Iterator iterate=myList.iterator();
				
				while(iterate.hasNext())
				{
					System.out.println(iterate.next());
				}
				
				
				//removing specific group of elements
				
				ArrayList myList2=new ArrayList();
				myList2.add(100);
				myList2.add("Welcome");
				
				myList.removeAll(myList2);
				
				System.out.println("After removing group of elements:"+myList); 

				//Clear all the elements
				
				myList.clear();
				System.out.println("After clearing :"+myList);  

	}

}
