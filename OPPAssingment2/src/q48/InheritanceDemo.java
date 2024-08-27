package q48;

public class InheritanceDemo extends Parent1,Parent2  {

	public static void main(String[] args) {
		InheritanceDemo d=new InheritanceDemo();
		
		//Diamond Problem 
		d.play();// here ambiguity arise which method to call from Parent1 or Parent2 
		
		//solved using interfaces, as they have only abstract method which means no implementation in parent classes
		// child class have implementation to abstract method
	}
}
