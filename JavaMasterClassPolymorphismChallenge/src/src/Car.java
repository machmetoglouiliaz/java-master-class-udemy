package src;

public class Car {
	
	private String description;
	
	public Car(String description) {
		super();
		this.description = description;
	}
	
	public static Car createCar(int type) {
		return switch (type) {
			case 1 -> new GasPoweredCar("A random gaspowered car", 15, 6);
			case 2 -> new ElectricCar("A random electric car", 400, 30); 
			case 3 -> new HybridCar("A random hybrid car", 10, 30, 6);
			default -> new Car("A random car");
		};
			
	}

	public void startEngine() {
		
	}
	
	public void drive() {
		
	}
	
	protected void runEngine() {
		
	}
}
