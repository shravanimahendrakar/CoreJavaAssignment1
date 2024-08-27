package q45;

public class DemoAccessSpecifiers  extends AccessSpecifiers{

	public void showAccessableInChildClass() {
		System.out.println("\nFrom child class");
		publicAccessMethod();//Accessible anywhere
		//privateAccessMethod();//can not be accessed outside the class
		protectedAccessMethod();//Accessible within same package with inheritance
		defaultAccessMethod();//Accessible within same package
	}

}
