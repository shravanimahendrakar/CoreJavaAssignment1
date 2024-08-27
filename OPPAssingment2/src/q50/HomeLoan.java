package q50;

public class HomeLoan implements Loan {

	@Override
	public void documents() {
		System.out.println("Home loan documents");		
	}

	@Override
	public void monthlyPayment() {
		System.out.println("Home loan monthly Payment");		
	}	
}
