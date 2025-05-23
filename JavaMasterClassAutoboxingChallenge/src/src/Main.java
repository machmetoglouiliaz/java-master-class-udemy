package src;

public class Main {
	
	public static void main(String[] args) {
		
		Bank bank = new Bank("DevBank");
		
		bank.addCustomer("Mourat");
		bank.addCustomer("Yumi");
		
		bank.makeTransaction("Mourat", "Yumi", 1000);
		
		bank.printCustomer("Mourat");
		bank.printCustomer("Yumi");
	}
}
