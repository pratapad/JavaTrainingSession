package OOPSConceptPart2;

public class HSBCBank implements USBank,BrazilBANK{// we are achieving multiple inheritances here
	//is - a relationship

	public void credit() {
		System.out.println("HSBC----Credit");
		
	}
	
	public void debit() {
		System.out.println("HSBC----debit");
		
	}

	
	public void transferMoney() {
		System.out.println("HSBC-----transferMoney");
		
	}
	
	public void educationLoan() {
		System.out.println("HSBC-----education loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC------Carloan");
	}

	//Brazil interface method --overriding brazilBank method 
	public void mutualFunds() {
		
		System.out.println("HSBC-------mutualFunds");
		
		
	}
	

}
