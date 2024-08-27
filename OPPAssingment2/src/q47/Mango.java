package q47;

public class Mango extends Plant{
	
	public Mango(String name) {
		super(name);//call the constructor of parent class to set the value of name
	}

	public static void main(String[] args) {
		Mango m=new Mango("Mango");
		//it is method of parent class as we inherited in the mango child class it is aviable in mango class as well
		m.DisplayDetails();
		
		//Accessing instance variable of parent class using child class object
		System.out.println("Using child class object : "+m.getName());
	}

}
