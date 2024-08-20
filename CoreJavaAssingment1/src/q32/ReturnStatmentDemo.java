package q32;

public class ReturnStatmentDemo {

	public static int m1(int i) {
		return i * i;
	}

	public static void main(String[] args) {
		// call m1 method from here in different ways

		int result = ReturnStatmentDemo.m1(3);
		System.out.println("Result 1 :" + result);

		System.out.println("Result 2 :" + m1(6));

		int total = 10 + ReturnStatmentDemo.m1(4);
		System.out.println("total :" + total);
	}

}