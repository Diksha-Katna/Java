package LearningJava;

public class practice2 {

	public static void main(String[] args) {

		
		int number1=100,number2=200,number3;
		
		System.out.println("Welcome:"+number1);  //here the value stored in number 1 is getting print with welcome  //Welcome100
		System.out.println("Welcome:"+5000); //here direct value we are putting so value will get print with welcome message//Welcome5000
		System.out.println("Welcome:"+number1+number2); //Welcome:100200
		//arithmetic operators
		
		System.out.println(number1+number2);
		System.out.println("The sum is :" +(number1+number2));
		System.out.println("The sum is :" +(number1*number2));
		
		//assignment operators
		number3=number1+number2;
		System.out.println("Sum is :"+number3);
		
		number3+=600;
		System.out.println("The new value of number3 is  :"+number3);
		
		
		//relational operators
		
		System.out.println("number1 is less than number 2:"+(number1<number2));
		
		
		//Conditional Operator
		
		int result=(number1<number2)?number1:number2;
		
	    System.out.println(result);
	    
	    //Urinary Operator 
	    
	    int uni=++number1;
	    System.out.println(uni);
	    
	    
	    //logical operator
	    
	    System.out.println("Logical And:"+(number1<number2&&number1<number3));
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
