package ListConcept;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		int a[]= new int[3];//static array.size is fixed
		
		//Dynamic array----ArrayList
		//1.maintains insertion order
		//2.can contain duplicate values
		//3.its not synchronized
		//4.allows random access to fetch the values because it stores values on basis of indexes
		ArrayList ar= new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		System.out.println(ar.size());
		ar.add(50);
		ar.add(50);
	   System.out.println(ar.size());
	   System.out.println(ar.get(4));
	   //to print all the values from arraylist 
	   //1.for loop
	   for(int i=0;i<ar.size();i++) {
		   System.out.println(ar.get(i));
	   }
		//Java Non Generics vs Generic
	   ArrayList<Integer> ar1 = new ArrayList<Integer>();
	   ar1.add(100);
	   //ar1.add("Selenium");
	   ArrayList<String> ar2 = new ArrayList<String>();
	   ar2.add("selenium");
	   ArrayList<E> ar3= new ArrayList<E>();
	   
	   //Employee class objects
	   Employee e1 = new Employee("Ravi", 27, "QA");
	   Employee e2= new Employee("Naveen",37," DEV");
	   Employee e3 = new Employee("Suman",32,"HR");
	   
	   //add class objects into an arraylist
	   ArrayList<Employee> ar4= new ArrayList<Employee>();
	   ar4.add(e1);
	   ar4.add(e2);
	   ar4.add(e3);
	   //Add this array list to iterator to traverse all the values and print all the values
	    java.util.Iterator<Employee> it = ar4.iterator();
	    while(it.hasNext()) {
	    	Employee emp=it.next();
	    	System.out.println(emp.name);
	    	System.out.println(emp.age);
	    	System.out.println(emp.dept);
	    	
	    }
	    
	    ArrayList<String> ar5= new ArrayList<String>();
	    ar5.add("selenium");
	    ar5.add("Appium");
	    ar5.add("test");
	   
	    ArrayList<String> ar6= new ArrayList<String>();
	    ar6.add("QA");
	    ar6.add("test");
	    ar6.add("Prod");
	    System.out.println("****************");

	    //add all to ar5 from ar6
	    ar5.addAll(ar6);
	    for(int i=0;i<ar5.size();i++) {
	    	System.out.println(ar5.get(i));
	    }
	    System.out.println("****************");

	    //remove all
	    ar5.removeAll(ar6);
	    for(int i=0;i<ar5.size();i++) {
	    	System.out.println(ar5.get(i));
	    }
	    System.out.println("****************");
	    //retain all common 
	    
	    ArrayList<String> ar7= new ArrayList<String>();
	    ar7.add("selenium");
	    ar7.add("Appium");
	    ar7.add("test");
	   
	    ArrayList<String> ar8= new ArrayList<String>();
	    ar8.add("QA");
	    ar8.add("test");
	    ar8.add("Prod");
	    ar7.retainAll(ar8);
	    for(int i=0;i<ar7.size();i++) {
	    	System.out.println(ar7.get(i));
	    }

	    
	   
	   
	   
	   
	   
	   

	}

}
