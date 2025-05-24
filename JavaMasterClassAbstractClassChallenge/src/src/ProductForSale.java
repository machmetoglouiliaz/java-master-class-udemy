package src;

public abstract class ProductForSale {
	
	private String type;
	private double price;
	private String description;
	
	public ProductForSale(String type, double price, String description) {
		super();
		this.type = type;
		this.price = price;
		this.description = description;
	}

	public double getSalesPrice(int quantity) {
		return quantity * price;
	}
	
	public void printPricedItem(int quantity) {
		System.out.println(String.format("%20s:%3d x%6.2f =%6.2f", (description + "(" + type + ")"), quantity, price, getSalesPrice(quantity)));
	}
	
	public abstract void showDetails();

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}
	
	
}


