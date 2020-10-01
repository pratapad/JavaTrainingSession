package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// Array: to store similar datatype values in a variable.
		//one dimensional
		//disadvantages of 1 d array
		//1.size is fixed.Static array
		//2.stores only similar tyoe of data--to over come this problem we use object array
		
		
		//1.int Array
		
		int i[]= new int [4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		         System.out.println(i[3]);
		         System.out.println(i[2]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException	
		         System.out.println(i.length);
		
		//to print all the values of an array we need to use for loop
		for(int j=0;j<i.length;j++) {
			     System.out.println(i[j]);
		}

		//2.double array
		        double d[]= new double[4];
	        	d[0]=87.88;
		        d[1]=12.33;
		        d[2]=34.44;
		        d[3]=77.33;
				System.out.println(d[2]);
				System.out.println(d[0]);
				
		//3. char array
				char c[]= new char[3];
				c[0]='d';
				c[1]='4';
				c[2]='f';
				System.out.println(c[2]);
				
		//4.String array
				String s[]= new String[3];
				s[0]="Hello";
				s[2]="WOrld";
				s[1]="hi";
				System.out.println(s[2]);
				System.out.println(s.length);
		//5.boolean array
				boolean b[]= new boolean[2];
				b[0]= true;
				b[1]= false;
				
				System.out.println(b[1]);
		//6.object array
				Object ob[]=new Object[6];
				ob[0]='2';
				ob[1]="Master";
				ob[2]='3';
				ob[3]=12.33;
				ob[4]=24;
				ob[5]= true;
				System.out.println(ob.length);
				System.out.println(ob[4]);
				
				
		
	}

}
