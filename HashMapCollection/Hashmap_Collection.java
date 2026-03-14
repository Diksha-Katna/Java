package LearningJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class Hashmap_Collection {

	public static void main(String[] args) {
		
		//Declaration
				//HashMap hm=new HashMap();

				//Map <Integer,String> hm=new HashMap<Integer,String>();
				
				HashMap <Integer,String> hm=new HashMap<Integer,String>();
				
				//Adding pairs to hashmap
				hm.put(101, "John");
				hm.put(102, "Scott");
				hm.put(103, "Mary");
				hm.put(104, "Scott"); // duplicate values are allowed
				hm.put(102, "David");  // key102 is duplicated - not allowed
				hm.put(null, null);
								
				
				//Printing hashmap
				System.out.println("HanshMap contant:"+hm); //{null=null, 101=John, 102=David, 103=Mary, 104=Scott}
				
				//Remove pair from hashmap
				hm.remove(103); // here 103 is key
				System.out.println("HanshMap contant after pair is removed:"+hm);//{null=null, 101=John, 102=David, 104=Scott}
				
				//Access specific value from the hashmap
				System.out.println("The value of 104 key:"+hm.get(104)); //Scott  here 104 is a key
				
				//Accessing all the keys from hashmap
				System.out.println("Keys in the hashmap:"+hm.keySet()); //[null, 101, 102, 104]
				
				//Accessing all the values from hashmap
				System.out.println("values in the hashmap:"+ hm.values()); //[null, John, David, Scott]
				
				//approach 1 ) Reading hashmap using for..each loop
				
				/*for(Integer key:hm.keySet())   //[null, 101, 102, 104]
				{
					System.out.println(key+"    "+hm.get(key));
				}
				*/
				
				//approach 2 ) Reading hashmap using Iterator
				System.out.println(hm); 			//{null=null, 101=John, 102=David, 104=Scott}
				System.out.println(hm.entrySet());//[null=null, 101=John, 102=David, 104=Scott]   
				
				
				//Reading hashmap using ierator  along with Entry
				/*Iterator<Entry<Integer, String>> itr=hm.entrySet().iterator();
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
					
					//Entry <Integer,String>entry=itr.next();
					//System.out.println(entry.getKey()+"     "+entry.getValue());
				}
				*/
				
				//approach 3 ) Reading hashmap using Iterator
				
				Iterator<Integer> itr=hm.keySet().iterator();
				
				while(itr.hasNext())
				{
					Integer key=itr.next();
					System.out.println(key+"   "+hm.get(key));
				}
				
				//clear the hashmap
				hm.clear();
				
				System.out.println("Is emtry?"+ hm.isEmpty()); //true
				
				
				
				
				
				
				
				
			}
	}


