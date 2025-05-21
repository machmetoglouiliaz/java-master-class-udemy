package src;

public class Drink extends Item{
	private String Size;

	public Drink(String type, String size) {
		super(type, size.charAt(0) == 'S' ? 1.49 : size.charAt(0) == 'M' ? 1.99 : 2.49);
		Size = size;
	}

	public String getSize() {
		return Size;
	}

	
}
