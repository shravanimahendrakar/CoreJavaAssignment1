package q28;

public class ReturnValToExp {

	public static int m1(int i) {
		System.out.println("m1 called");
		return i * i;
	}

	public static void main(String[] args) {
		// call m1 method and pass some number
		int value = ReturnValToExp.m1(20);
		int total = 100 + value;
		System.out.println(total);
	}

}