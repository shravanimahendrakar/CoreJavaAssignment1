package q45Demo;

import q45.DemoAccessSpecifiers;

public class DemoDefaultAccess {

	public static void main(String[] args) {
		DemoAccessSpecifiers d = new DemoAccessSpecifiers();
		
	//	d.protectedAccessMethod();//can not be accessed in different package
	//	d.defaultAccessMethod();////can not be accessed in different package
		d.publicAccessMethod();//access anywhere
	//	d.privateAccessMethod();//can not be accessed outside the class

	}

}
