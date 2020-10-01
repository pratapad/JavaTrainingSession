package OOPSConceptPart1;

public class LocalVsGlobalVariables {
	
	//Global variables or Class variables
	String name="John";
	int age=20;

	public static void main(String[] args) {
	// local variables

		int i=10;//local variable
		System.out.println(i);
		//non static variables global variables are accesed with obj
		//local variables can be called directly
		LocalVsGlobalVariables lgv = new LocalVsGlobalVariables();
		System.out.println(lgv.age);//we have to create object of this variable to access class variables
	    lgv.sum();
	}
	
	
	public void sum() {
		int i=50; //local variables
		int j=60;
		int k=i+j;
		System.out.println(k);
	}
}