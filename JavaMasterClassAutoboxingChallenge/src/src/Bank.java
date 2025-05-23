package src;

import java.util.ArrayList;

public class Bank {
	
	record Customer(String name, ArrayList<Double> transactions) {
		public Customer(String name) {
			this(name, new ArrayList<>());
		}
	}

	private String name;
	private ArrayList<Customer> customers;
	
	public Bank(String name) {
		this.name = name;
		customers = new ArrayList<>();
	}
	
	public Customer addCustomer(String name) {
		Customer newC = new Customer(name);
		if(findCustomer(name) != null) return null;
		
		customers.add(newC);
		return newC;
	}
	
	public boolean makeTransaction(String from, String to, double amount) {
		
		Customer fromC = findCustomer(from);
		Customer toC = findCustomer(to);
		if(fromC == null || toC == null) return false;
		
		fromC.transactions.add(-amount);
		toC.transactions.add(amount);
		return true;
	}
	
	private Customer findCustomer(String name) {
		for(Customer c : customers) {
			if(c.name().equalsIgnoreCase(name)) return c;
		}
		
		return null;
	}
	
	public void printCustomer(String name) {
		Customer c = findCustomer(name);
		if(c == null) return;
		
		System.out.println("Name: " + c.name);
		System.out.println("-".repeat(30));
		for(double t : c.transactions) {
			System.out.printf("$%10.2f%n", t);
		}
		System.out.println("-".repeat(30) + "\n");
	}
}
