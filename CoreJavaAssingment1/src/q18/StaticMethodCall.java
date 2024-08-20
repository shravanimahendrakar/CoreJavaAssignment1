package q18;

public class StaticMethodCall {

	public static void m1(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		StaticMethodCall.m1(12);
	}
}
