package q27;

public class ReturnStatementDemo {

	public static int m1(int i) {
		System.out.println("m1 called");
		return i * i;
	}

	public static void main(String[] args) {
		// call m1 method from here
		ReturnStatementDemo.m1(20);
	}

}