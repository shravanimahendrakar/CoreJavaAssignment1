package q47;

public class Plant {
	private String name;

	public Plant(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void DisplayDetails() {
		System.out.println("Name of plant is : "+name);
	}

}
