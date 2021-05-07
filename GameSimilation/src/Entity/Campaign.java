package Entity;

public class Campaign {
	private int id;
	private String name;
	private double discount;
	
	public Campaign() {}
	
	public Campaign(String name, double discount) {
		super();
		this.name = name;
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
