package OOPSConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x= "100";
		System.out.println(x+20);
		
		//String to int
		//Integer is wrapper class to convert other datatype to integer
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to double
		String y="12.33";
		//Double is the wrapper class to convert string to double
		double d= Double.parseDouble(y);
		System.out.println(d+20);
		
		//String to boolean
		String z= "true";
		boolean b= Boolean.parseBoolean(z);
		System.out.println(b);
		
		//String to Integer
		String a="40";
		int k= Integer.parseInt(a);
		System.out.println(k+20);
	
		//Int to String conversion
		//String.valueOf is used to convert to int
		
		int j=100;
		System.out.println(j+20);
		String s= String.valueOf(j);
		System.out.println(s+20);
		
		String p="100A";//NumberFormat Exception
		int q=Integer.parseInt(p);
		System.out.println(q);
		

	}

}
