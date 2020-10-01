package JavaBasics;

public class ConstructorConcept {
	
	//Constructor means a class entity which is used to define some class features in the form of objects
	//have some properties
	//Doesn't return any value
	//looks like function but not a function
	//constructor can be loaded
	
	public ConstructorConcept(){ //zero parameter constructor
		System.out.println("zero parameter constructor");
		
	}
	public ConstructorConcept(int i) {
		System.out.println("Single param constructor");
	}
	public ConstructorConcept(int i, int j) {
		System.out.println("Two params constructor");
		System.out.println("Print the value of i:"+i);
		System.out.println("Print the valu of j:"+j);
	}

	public static void main(String[] args) {
		ConstructorConcept cc= new ConstructorConcept();
		ConstructorConcept cc1= new ConstructorConcept(20);
		ConstructorConcept cc2= new ConstructorConcept(20,30);


		
		

	}

}
