package OOPSConceptPart1;

public class CallByValAndCallByRef {
	
	int p;
	int q;
	

	public static void main(String[] args) {
		CallByValAndCallByRef obj= new CallByValAndCallByRef();
		
		
		//call by value or pass by value
		int x=30;
		int y=40;
	    int z=obj.testSum(x,y);
	    System.out.println(z);
	    obj.p=60;
	    obj.q=80;
	    obj.swap(obj);
	    System.out.println(obj.p);
	    System.out.println(obj.q);
	

	}
	public int testSum(int a,int b) {
		a=12;
		b=34;
		int c=a+b;
		return c;	
		
	}
	
	//call by reference using t and passing obj to t
	
	public void swap(CallByValAndCallByRef t) {
		int temp=t.p;//temp=60
		t.p=t.q;//t.p=80
		t.q=temp;//t.q=60
		
		
		
	}

}
