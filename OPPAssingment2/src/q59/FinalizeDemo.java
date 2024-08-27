package q59;

import com.javaTraining.Employee;

public class FinalizeDemo {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		Employee e=new Employee(11, "shravani", 1000);
		System.out.println(e.hashCode());
		System.out.println(e);
	
		System.gc();//to call finalize() default 
		//otherwise once the execution is completed and local variable dereferenced then Garbage collector remove object after calling finalize method
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finish");
	}

}
