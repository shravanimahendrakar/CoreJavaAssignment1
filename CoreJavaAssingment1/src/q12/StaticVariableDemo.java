package q12;

public class StaticVariableDemo {

	private static int total = 10;

	public static void main(String[] args) {
		System.out.println(total);
		System.out.println(StaticVariableDemo.total);
		StaticVariableDemo d = new StaticVariableDemo();
		System.out.println(d.total);
	}
}
