package q1;

public class Product {

	private int id;
	private String name;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static void DisplayDetails(Product prod) {
		System.out.println("Product id: "+prod.getId()+"\nProduct name: "+prod.getName()+"\nProduct price: "+prod.getPrice());
	}
	
	
	public static void main(String[] arg) {
		Product p=new Product();
		p.setId(12);
		p.setName("Heater");
		p.setPrice(240.56d);
		Product.DisplayDetails(p);
	}

}
