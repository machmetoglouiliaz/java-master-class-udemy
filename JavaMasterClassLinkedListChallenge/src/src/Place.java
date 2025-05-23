package src;

public class Place {
	private String name;
	private int distance;
	
	public Place(String name, int distance) {
		super();
		this.name = name;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public int getDistance() {
		return distance;
	}
	
	@Override
	public String toString() {
		return name + " is " + distance + "km away from Sydney!"; 
	}
	
}
