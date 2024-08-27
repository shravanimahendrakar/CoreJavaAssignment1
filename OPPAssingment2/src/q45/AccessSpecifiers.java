package q45;

public class AccessSpecifiers {

	public void publicAccessMethod() {
		System.out.println("Public method");
	}

	private void privateAccessMethod() {
		System.out.println("Private method");
	}

	protected void protectedAccessMethod() {
		System.out.println("Protected method");
	}

	void defaultAccessMethod() {
		System.out.println("Default method");
	}
	
	public void showAccess() {
		
		publicAccessMethod();//Accessible 
		privateAccessMethod();//Accessible within the class
		protectedAccessMethod();//Accessible
		defaultAccessMethod();//Accessible
	}
}
