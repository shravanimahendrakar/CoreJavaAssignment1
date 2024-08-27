package q46;

import com.javaTraining.Employee;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Employee e = new Employee(22, "shravani", 1000);	
		
		//member variable can be accessed only be getter/setter 
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
	}

}
