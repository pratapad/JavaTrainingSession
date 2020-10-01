package OOPSConceptPart1;


//a class is an entity which defines properties in the forms of function,methods and variables
public class Car {
	// Class Variables or Global variables
	int model;
	int wheel;

	public static void main(String[] args) {
		// we have to create an object 
		//object is an instance of a class
		//a is the reference variable
		//new Car() is an object
		//we cannot define duplicate reference variables
		// a copy of the class variables will be given to each object
		
		Car a= new Car();
		Car b= new Car();
		Car c= new Car();
		
		//we have initialized class variables with reference variables
		a.model=2016;
		a.wheel=4;
		
		b.model=2017;
		b.wheel=3;
		
		c.model=2018;
		c.wheel=2;
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println(b.model);
		System.out.println(b.wheel);
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		System.out.println("After shifting the references:");
		
		a=b;
		b=c;
		c=a;
		
		a.model=10;
		System.out.println(a.model);
		c.model=20;
		System.out.println(a.model);
		System.out.println(c.model);
		

	}

}
