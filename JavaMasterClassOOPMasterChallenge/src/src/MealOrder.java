package src;

public class MealOrder {
	private Hamburger hamburger;
	private Drink drink;
	private Side side;
	private boolean isDeluxe;
	private double deluxePrice = 9.99;
	
	public MealOrder() {
		super();
		this.hamburger = new Hamburger("Regular", 2.99);
		this.drink = new Drink("Cola", "Small");
		this.side = new Side("French fries", 1.99);
	}
	
	public MealOrder(Hamburger hamburger, Drink drink, Side side, boolean isDeluxe) {
		super();
		this.hamburger = hamburger;
		this.drink = drink;
		this.side = side;
		this.isDeluxe = isDeluxe;
	}
	
	public double calculateTotal() {
		if(isDeluxe) return deluxePrice;
		double total = 0;
		total += hamburger.calcPrice();
		total += drink.getPrice();
		total += side.getPrice();
		return total;
	}
	
	public void printCheck() {
		System.out.printf("%30s: $%6.2f\n", hamburger.getType() + " hamburger with " + hamburger.getToppings(), hamburger.calcPrice());
		System.out.printf("%30s: $%6.2f\n", drink.getSize()+drink.getType(), drink.getPrice());
		System.out.printf("%30s: $%6.2f\n", side.getType(), side.getPrice());
		System.out.println("-".repeat(50));
		System.out.printf("%30s: $%6.2f\n", "Total", calculateTotal());
	}
}
