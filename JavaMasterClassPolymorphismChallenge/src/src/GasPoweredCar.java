package src;

public class GasPoweredCar extends Car{

	private double avgKmPerLitre;
	private int cylinders;
	
	public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
		super(description);
		this.avgKmPerLitre = avgKmPerLitre;
		this.cylinders = cylinders;
	}
	
	
	
	@Override
	public void runEngine() {
		System.out.println("whom whom");
	}
	
	@Override
	public void startEngine() {
		System.out.println("Gas -> Engine started!");
	}
	
	@Override
	public void drive() {
		System.out.println("Gas -> Driving!");
	}
}
