package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		BMW b =new BMW();
		
		//compile time polymorphism/Static polymorphism,compiler decides which method to call
		//one to many
		b.start();
		//When same method is present in both parent and child class with same number of arguments
		//it is called 
        //preference will be given to overridden method that is child class
		b.stop();//inherits from car class
		b.refuel();//inherits from car class
		b.theftSafety();
		b.engine();

		System.out.println("*************");
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		//Parents cannot inherit all the properies from child class
		
		
		//Top Casting
		Car c1=new BMW();
		//child class object can referred by parent class reference variable,it is called 
		//dynamic polymorphism/runtime polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down Casting
		BMW b1= (BMW) new Car();
	    
				
	}

}
