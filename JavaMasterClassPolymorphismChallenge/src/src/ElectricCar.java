package src;

public class ElectricCar extends Car{

	private double avgKmPerCharge;
	private int batterySize;
	
	public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
		super(description);
		this.avgKmPerCharge = avgKmPerCharge;
		this.batterySize = batterySize;
	}
	
	@Override
	public void runEngine() {
		System.out.println("...");
	}
	
	@Override
	public void startEngine() {
		System.out.println("Elec -> Engine started!");
	}
	
	@Override
	public void drive() {
		System.out.println("Elec -> Driving!");
	}
}
