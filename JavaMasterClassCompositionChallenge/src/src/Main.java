package src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartKitchen kitchen = new SmartKitchen();
		
		kitchen.addWater();
		kitchen.getBrewMaster().brewCoffee();
		kitchen.pourMilk();
		kitchen.getIceBox().orderFood();
		kitchen.loadDishwasher();
		kitchen.getDishWasher().doDishes();
		
		System.out.println("-".repeat(15));
		
		kitchen.setKitchenState(true, true, false);
		kitchen.doKitchenWork();
	}

}
