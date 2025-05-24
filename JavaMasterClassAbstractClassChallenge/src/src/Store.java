package src;

import java.util.ArrayList;

public class Store {
	
	record OrderItem(int quantity, ProductForSale product) {}
	
	private ArrayList<OrderItem> order;
	private ArrayList<ProductForSale> products;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
		
		store.addNewProduct(new Orange());
		store.addNewProduct(new Apple());
		
		store.orderItem(5, "Orange");
		store.orderItem(2, "Apple");
		
		store.printOrder();
		
	}
	
	
	
	public Store() {
		order = new ArrayList<>();
		products = new ArrayList<>();
	}



	public boolean addNewProduct(ProductForSale p) {
		if(findProduct(p.getDescription()) != null) return false;
		
		products.add(p);
		return true;
		
	}
	
	public boolean orderItem(int quantity, String description) {
		ProductForSale p = findProduct(description);
		if(p == null) return false;
		if(quantity < 1) return false;
		
		order.add(new OrderItem(quantity, p));
		return true;
	}
	
	private ProductForSale findProduct(String description) {
		for(var p : products) {
			if(p.getDescription().equalsIgnoreCase(description)) return p;
		}
		
		return null;
	}
	
	public void printOrder() {
		System.out.println("Order List:");
		for(OrderItem oi : order) {
			oi.product.printPricedItem(oi.quantity);
		}
	}

}
