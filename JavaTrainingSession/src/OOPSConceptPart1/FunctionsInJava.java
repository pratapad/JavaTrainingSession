package OOPSConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		//main method is void ,never returns a value. never write return statement inside the main 
		
		//created an object of functioninjava class to access all the non static methods
		//obj is the reference variable
		//after creating the object a copy of all non static methods is given to this object
		//to call non static method we need to create object 
		//non static method doesn't have a static keyword and it belongs to the object of the class 
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		int l=obj.abc();
		System.out.println(l);
		String s1=obj.qa();
		System.out.println(s1);
		int div=obj.division(40, 2);
		System.out.println(div);
		
	}
	
	//Functions are also called method
			//functions are methods are like factory like nike,reebok.
			//if we pass nike we will get nike cap,nike t shirt etc.
			// Non Static methods
			//1.no input no poutput
			//no input but some output
			//passing input getting some output.
		
	//void-doesnot return any value
	//return tyoe of test method is void
		public void test(){
		System.out.println("Test Method");// no input no output
		}
	
   // return type of abc method  is int
		public int abc() {
			System.out.println("abc Method");//no input some output
			int p= 12;
			int q= 13;
			int r= p+q;
			return r;
		}
		
	//return type of QA method is String	
		public String  qa() {
			System.out.println("QA Method");//no input some output
			String s= "Selenium";
			return s;
		}
	
    // return type of Division is int
		public int division(int x , int y) {
			System.out.println("Division Method");//some input and some output
			//x and y are input parameters
			int d=x/y;
			return d;
			
			
		}
		

	}


