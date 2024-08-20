package q29;

public class FloatReturnType {

	public static float m1(int i) {
		System.out.println("m1 called");
		return i * i;
	}

	public static void main(String[] args) {
		// call m1 method and pass some number
		float value = FloatReturnType.m1(20);
		int total = (int) (100 + value);
		System.out.println(total);
	}

}