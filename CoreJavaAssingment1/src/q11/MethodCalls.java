package q11;

public class MethodCalls {

	public static void main(String[] args) {
		show();
		MethodCalls.show();
		MethodCalls d = new MethodCalls();
		d.show();
	}

	public static void show() {
		System.out.println("show method");
	}
}
