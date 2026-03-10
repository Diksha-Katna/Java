package LearningJava;


interface vehicle
{
	int max_speed=120; // final & Static
	int min_speed=10;   //final static
	
	void start(); // abstract method. No need to specify abstract keyword, public modifier is accociated
	
	default void drive()  // Default method ( supported from java8) 
	{
		System.out.println("Driving safely...");
	}
	
	static void showMaxSpeed()   // Static method (supported from java 8)
	{
		System.out.println("Maximum speed is:"+ max_speed);
	}
	
	private void showMinSpeed()  // Private method (supported from java 9)
	{
		System.out.println("Minimum speed is:"+ min_speed);
	}
	
	default void showSpeeds()
	{
		showMaxSpeed();
		showMinSpeed();
	}
}


class Car implements vehicle
{
	
	public void start()
	{
		System.out.println("Car is starting....");
	}
}



public class Interface {

	
	public static void main(String[] args) {
		vehicle v=new Car();
		v.start();
		v.drive();
		vehicle.showMaxSpeed();  // static method directly called through Interface
		//v.showMinSpeed(); // cannot access since it is private method
		
		v.showSpeeds();
		
	}
}
