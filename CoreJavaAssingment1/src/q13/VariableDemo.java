package q13;

public class VariableDemo {

	int x = 10;

	public void show() {
		int x = 100;
		System.out.println(x);// do required changes at this line but output should be 100
		VariableDemo d = new VariableDemo();
		System.out.println(d.x);// do required changes at this line but output should be 10
	}

	public static void main(String[] args) {
		VariableDemo d = new VariableDemo();
		d.show();
	}
}
