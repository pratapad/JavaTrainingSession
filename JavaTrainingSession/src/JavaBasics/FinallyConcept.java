package JavaBasics;

public class FinallyConcept {

	public static void main(String[] args) {
		test1();
		testDivision();
		

	}
	// Finally is a block
	//Finally will be executed even if there is an exception is thrown
	//finally is executed always 
	//finally is always used with try catch block
	//when we are retrieving data from database and if there is an error also//
	//finally can be used to close the connection
	//In selenium also webdriver.quit can be written in finally to close the browser
	
	public static void test1() {
		try {
			System.out.println("this is try inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e){
			System.out.println("Inside Catch Block");
		}
		
		finally{
			System.out.println("Finally is executed");
		}
	}
	
	public static void testDivision() {
		try {
			int i=10;
			System.out.println("inside try block");
			int k=i/0;
		}catch(NullPointerException Exception ) {
			System.out.println("inside catch block");
			System.out.println("divide by zero error");
		}
		finally {
			System.out.println("inside finally method");
		}
		
	}
	
	//Finalize is something related garbage collector.

}
