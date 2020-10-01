package ListConcept;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListConcept {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("UFT");
		ll.add("Appium");
		ll.add("RPM");
		
		//Print Linkedlist
		System.out.println("Linked list values"+ll);
		ll.addFirst("Shree");
		ll.addLast("Automation");
		System.out.println("Content of linkedlist is :"+ll);
		
		//get
		System.out.println(ll.get(0));
		System.out.println(ll.get(3));
		
		//set
	    ll.set(0, "DeepthiSree");
	    System.out.println(ll.get(0));
	   
	    //remove
	    ll.removeFirst();
	    ll.removeLast();
	    ll.remove(3);
	    
	    //to print all the values of linkedlist
	    //use for loop
	    for(int n=0;n<ll.size();n++) {
	    	System.out.println(ll.get(n));
	    }
	    //using advanced for loop
	    System.out.println("Print values of ll using advance for loop");
	    for(String str:ll) {
	    	System.out.println(str);
	    }
	    //using iterator
	    
	    System.out.println("Using iterator");
	    java.util.Iterator<String> it= ll.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    	
	    }
	    
	    //using while loop
	    System.out.println("Using while loop");
	    int num=0;
	    while(ll.size()>num) {
	    	System.out.println(ll.get(num));
	    	num++;
	    }
	    		
	    
	}

}
