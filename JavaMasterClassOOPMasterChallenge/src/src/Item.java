package src;

public class Item {

	private String type;
	private double price;
	
	public Item(String type, double price) {
		this.type = type;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public double addToPrice(double price) {
		this.price += price;
		return price;
	}

	public String getType() {
		return type;
	}

	
}
