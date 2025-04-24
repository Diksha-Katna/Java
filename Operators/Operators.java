package LearningJava;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic Operators
		
		int a=5;
		int b=2;
		int c=2;
		System.out.println("Welcome"+90);
		//System.out.println("Welcome"+z);   This statement will give error 
		System.out.println("Welcome"+a);
		System.out.println("Welcome"+a+b);
		System.out.println("Addition:" +(a+b));
		System.out.println("Subtraction:" +(a-b));
		System.out.println("Multiplication:" +(a*b));
		System.out.println("Dividend" +(a%b));
		System.out.println("Divide:" +(a/b));


       //Relational operators
		
		System.out.println("a is greater than b:" +(a>b));
		System.out.println("b is smaller than b:" +(b<a));
		System.out.println("b is equal to c:" +(b==c));
		System.out.println("a is not equal to b:" +(a!=b));
		System.out.println("a is greater than or equal to b:" +(a>=b));
		System.out.println("b is less than or equal to a:" +(b<=a));
		
		

     //Logical Operators
		
		System.out.println("Logical And:" +(a>b&&a>c));
		System.out.println("Logical And:" +(a>b||b>c));
		
		//Logical not operator is used with single value 
		
	    boolean x=true;
	    System.out.println(!x);
		
		
    //Unary Operator
	    
	    a++;
	    System.out.println("The increment operator "+a);         // From here new value of a will get updated so now a=6
	    b--;
	    System.out.println("The decrement operator "+b);         // From here new value of b will get updated so now b =1
	    System.out.println("Subtraction:" +(a-b));
	    

        // x++ and ++x is same when variable is the same but difference comes when we store the result in another variable
	    
	    int y=10;
	    int result=y++;
	    System.out.println(result);
	    
	    int z=90;
	    int result2=++z;
	    System.out.println(result2);
	    
	    
       //Assignment Operators
	    
	    a+=6;     // This is incrementing and updating the value so now a =12
	 	System.out.println(a);
	    
	    a-=2;
	    System.out.println(a);
	    
	    a*=2;
	    System.out.println(a);
	    
	    a%=2;
	    System.out.println(a);
	    
	    int m=80;
	    m/=2;
	    System.out.println(m);

	//Ternary or Conditional Operator
	    
	    int f=6;
	    int e=8;
	    
		System.out.println("Conditonal Operator:" +(f>e?f:e));

		

		
		
		

	}

}
