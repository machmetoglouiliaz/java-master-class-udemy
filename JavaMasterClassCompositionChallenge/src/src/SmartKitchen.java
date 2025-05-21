package src;

public class SmartKitchen {
	
	private CoffeeMaker brewMaster;
	private DishWasher dishWasher;
	private Refrigerator iceBox;
	
	
	public SmartKitchen() {
		brewMaster = new CoffeeMaker();
		dishWasher = new DishWasher();
		iceBox = new Refrigerator();
	}


	public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
		this.brewMaster = brewMaster;
		this.dishWasher = dishWasher;
		this.iceBox = iceBox;
	}


	
	
	public CoffeeMaker getBrewMaster() {
		return brewMaster;
	}


	public DishWasher getDishWasher() {
		return dishWasher;
	}


	public Refrigerator getIceBox() {
		return iceBox;
	}


	public void pourMilk() {
		iceBox.setHasWorkToDo(true);
		System.out.println("Milk is used!");
	}
	
	public void addWater() {
		brewMaster.setHasWorkToDo(true);
		System.out.println("Water added to the coffee machine, it's ready to brew!");
	}
	
	public void loadDishwasher() {
		dishWasher.setHasWorkToDo(true);
		System.out.println("Dishes loaded to the dishwasher!");
	}
	
	public void setKitchenState(boolean brewCoffee, boolean useMilk, boolean washDishes) {
		if(brewCoffee) addWater();
		if(useMilk) pourMilk();
		if(washDishes) loadDishwasher();
	}
	
	public void doKitchenWork() {
		brewMaster.brewCoffee();
		iceBox.orderFood();
		dishWasher.doDishes();
	}
}
