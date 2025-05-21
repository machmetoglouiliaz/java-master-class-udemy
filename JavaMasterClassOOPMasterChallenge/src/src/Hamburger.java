package src;

import java.util.ArrayList;
import java.util.List;

public class Hamburger extends Item{
	private List<Topping> toppings;
	private int maxTopping = 3;
	private int toppingCount;
	
	public Hamburger(String type, double price) {
		super(type, price);
		toppings = new ArrayList<>();
		toppingCount = 0;
	}

	public double addTopping(Topping topping) {
		addToppingToList(topping);
		return addToPrice(topping.getPrice());
	}
	
	public boolean addToppingToList(Topping topping) {
		if(toppingCount >= maxTopping) return false;
		this.toppings.add(topping);
		toppingCount++;
		return true;
	}

	public void setMaxToppings(int maxTopping) {
		this.maxTopping = maxTopping;
	}
	
	public double calcPrice() {
		double total = 0;
		total += getPrice();
		for(int i = 0; i < toppings.size(); i++)
			total += toppings.get(i).getPrice();
		return total;
	}
	
	public String getToppings() {
		String s = "";
		for(int i = 0; i < toppings.size(); i++)
			s += toppings.get(i).getType() + " ";
		return s;
	}

}
