package src;

public class Refrigerator {
	
	private boolean hasWorkToDo;
	
	public boolean isHasWorkToDo() {
		return hasWorkToDo;
	}


	public void setHasWorkToDo(boolean hasWorkToDo) {
		this.hasWorkToDo = hasWorkToDo;
	}


	public void orderFood() {
		if(hasWorkToDo) {
			System.out.println("Food ordered!");
			hasWorkToDo = false;
		}
		else System.out.println("No food is needed!");
	}
}
