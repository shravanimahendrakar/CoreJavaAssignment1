package q35;

public class LocalAndStaticVarDemo {

	static int total = 0;

	public static void add() {
		int total = 10 + 30;
	}

	public static void main(String[] args) {
		LocalAndStaticVarDemo.add();
		System.out.println(total);
	}

}