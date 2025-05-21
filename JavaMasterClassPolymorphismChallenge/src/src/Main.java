package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 4; i++) {
			doCarThings(Car.createCar(i));
		}
	}
	
	public static void doCarThings(Car car) {
		car.startEngine();
		car.drive();
	}

}
