package src;

public class DishWasher {
	
	private boolean hasWorkToDo;

	public boolean isHasWorkToDo() {
		return hasWorkToDo;
	}


	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}


	public void doDishes() {
		if(hasWorkToDo) {
			System.out.println("Dishes getting cleaned!");
			hasWorkToDo = false;
		}
		else System.out.println("Dishwasher is empty!");
	}
}
