package q22;

public class StringParam {

	public static void m1(String s) {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		// call m1 method from here
		StringParam.m1("cycle");
	}
}