package q45Demo;

import q45.DemoAccessSpecifiers;

public class DemoOutsidePackage {

	public static void main(String[] args) {
		DemoAccessSpecifiers d=new DemoAccessSpecifiers();
		
		d.showAccess();
		d.showAccessableInChildClass();
		
		System.out.println("\nFrom main class");
		d.publicAccessMethod();//access anywhere
		//d.privateAccessMethod();//can not be accessed outside the class
	//	d.protectedAccessMethod();//can not be accessed in different package with inheritance also
		//d.defaultAccessMethod();//can not be accessed in different package
	}

}
