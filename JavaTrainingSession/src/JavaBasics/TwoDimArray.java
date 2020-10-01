package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		String s[][]= new String[3][5];
		System.out.println(s.length);//total no.of rows
		System.out.println(s[0].length);//total no.of columns
		
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="c";
		s[0][3]="D";
		s[0][4]="E";
		
		s[1][0]="A1";
		s[1][1]="B1";
		s[1][2]="c1";
		s[1][3]="D1";
		s[1][4]="E1";
		
		s[2][0]="A2";
		s[2][1]="B2";
		s[2][2]="c2";
		s[2][3]="D2";
		s[2][4]="E2";
		
		
		System.out.println(s[0][3]);
		System.out.println(s[1][2]);
		System.out.println(s[2][2]);
		
		//to print all values of 2d array we use array
		//when row=0 col=0 to 4
		//row =1 col=0to 4
		//row=2 col=0 to 4
		
		for(int row=0;row<s.length;row++) {
			for (int col=0;col<s[0].length;col++) {
				System.out.println(s[row][col]);
				
			}
		}
			
		
		

	}

}
