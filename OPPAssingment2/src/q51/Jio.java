package q51;

public class Jio implements SimCard{

	@Override
	public void sms() {
		System.out.println("Jio sms");		
	}

	@Override
	public void call() {
		System.out.println("Jio call");		
	}
	
	public static void main(String[] args) {
		Jio j=new Jio();
		
		j.sms();
		j.call();
	}

}
