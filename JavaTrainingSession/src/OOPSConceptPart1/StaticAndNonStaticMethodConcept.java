package OOPSConceptPart1;

public class StaticAndNonStaticMethodConcept {
	
	//Global variables 
	//scope of global variables is through out all the functions with some condition if they are static or nonstatic 
	String name="Seeta";
	static int age=24;

	public static void main(String[] args) {
		//how to call static methods
		// 1.direct calling
		System.out.println("calling static method directly");
		Sum();
		//2.calling by classname
		System.out.println("calling static method by classname");
		StaticAndNonStaticMethodConcept.Sum();
		
		//calling non static methods by creating object of the class
		StaticAndNonStaticMethodConcept obj= new StaticAndNonStaticMethodConcept();
		obj.SendMail();
		
		System.out.println(age);
		System.out.println(obj.name);
		//Can i access static methods by using obj ,yes 
		obj.Sum();//warning will be given
		

	}
	
	public void SendMail() {
		System.out.println("Send mail method");
	}
	public static void Sum() {
		System.out.println("sum method");
	}

}
