package q19;

public class ParameterMethodDemo {

	public void m1(float a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		//call m1 method from here
		ParameterMethodDemo d=new ParameterMethodDemo();
		d.m1(13f);
	}
}
