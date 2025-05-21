package src;

public class HybridCar extends Car{
	
	private double avgKmPerLitre;
	private int cylinders;
	private int batterySize;
	
	public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
		super(description);
		this.avgKmPerLitre = avgKmPerLitre;
		this.batterySize = batterySize;
		this.cylinders = cylinders;
	}
	
	@Override
	public void runEngine() {
		System.out.println("... whom whom ... whom whom");
	}
	
	@Override
	public void startEngine() {
		System.out.println("Hyb -> Engine started!");
	}
	
	@Override
	public void drive() {
		System.out.println("Hyb -> Driving!");
	}
}
