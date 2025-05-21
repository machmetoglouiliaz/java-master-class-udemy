package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer(80, true);
		
		System.out.println("Number of printed pages: " + printer.printPages(10));
		
		System.out.println("Adding toner: " + printer.addToner(300));
		System.out.println("Adding toner: " + printer.addToner(-300));
		System.out.println("Adding toner: " + printer.addToner(30));
		System.out.println("Adding toner: " + printer.addToner(3));
	}

}
