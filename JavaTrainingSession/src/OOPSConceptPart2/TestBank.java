package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println("USBank.min_bal");
		//USBank.min_bal=200;
		HSBCBank hb= new HSBCBank();
		hb.credit();
		hb.debit();
		hb.transferMoney();
		hb.educationLoan();
		hb.carLoan();
		hb.mutualFunds();
		
	      // dynamic polymorphism 
		//child class object can be referred by parent interface variable
		USBank b= new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();

		
		
	       
				

	}

}
