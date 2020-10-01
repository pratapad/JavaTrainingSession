package JavaBasics;

public class ConstructorWithThisKeyword {
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name,int age) {
		System.out.println(name);
		System.out.println(age);
		this.name=name;
		this.age=age;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithThisKeyword obj= new ConstructorWithThisKeyword("tom",24);
		

	}

}
