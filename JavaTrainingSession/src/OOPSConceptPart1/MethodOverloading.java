package OOPSConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// calling sum method creating an object of this class with a  reference variable
		MethodOverloading ml= new MethodOverloading();
		ml.sum();
		ml.sum(10);
		ml.sum(20,30);

	}
	
	//We can over load main () method 
	//Method Overloading is the same method with different input parameters and different datatypes  within the same class 
	
	public static void main() {
		
	}
	public static void main(int x) {
		
	}
	public static void main(String s) {
		
	}
	
	public void sum() {
		System.out.println("Sum Method with zero parameters");
	}
	public void sum(int i) {
		System.out.println("Sum Method with one input parameter:" +i);
		
	}
	
	public void sum(int j,int k) {
		System.out.println("Sum Method with two Input parameters");
		System.out.println(j+k);
	}

}
