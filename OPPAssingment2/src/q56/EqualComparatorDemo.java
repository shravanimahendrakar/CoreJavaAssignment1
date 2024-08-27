package q56;

import q53.Product;

public class EqualComparatorDemo {

	public static void main(String[] args) {
		Product p1 =new Product(11, "chair", 80, 4);
		Product p2 =new Product(12, "table", 1000, 2);
		
		System.out.println(p1.equals(p2));
	}

}
