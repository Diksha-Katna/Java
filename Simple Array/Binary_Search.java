package LearningJava;

public class Binary_Search {

	public static void main(String[] args) {
		
		int []a= {12,14,16,18,20};
		
		int mid,first=0,last=a.length-1;
		int item=16,result=-1;
		
		
		while(first<=last)
		{
			mid=first+last/2;
		    if(item==a[mid])
			{
			  result=mid;
			  break;
			}
		else if (item<a[mid])
			{
			last=mid-1;
			}
		
		else
			{
			first=mid+1;
			}
		
		
		}
		if(result==-1) 
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("The element is found at index " +result);
	    }
	
		

}
	
}
