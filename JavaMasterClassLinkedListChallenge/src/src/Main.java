package src;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static LinkedList<Place> places = new LinkedList<>();
	static ListIterator<Place> placeIter;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isAppEnded = false;
		String choice;
		addPlace(new Place("Sydney", 0));
		addPlace(new Place("Adelaide", 1374));
		addPlace(new Place("Alice Spring", 2771));
		addPlace(new Place("Brisbane", 917));
		addPlace(new Place("Darwin", 3972));
		addPlace(new Place("Melbourne", 877));
		addPlace(new Place("Perth", 3923));
		
		placeIter = places.listIterator();
		
		while(!isAppEnded) {
			printMenu();
			choice = scanner.nextLine();
			
			switch(choice) {
			case "F", "Forward" -> System.out.println(placeIter.next());
			case "B", "Backward" -> System.out.println(placeIter.previous());
			case "L", "List", "List Places" -> System.out.println(places);
			case "Q", "Quit" -> isAppEnded = true;
			default -> isAppEnded = true;
			}
		}
		
	}
	
	public static void printMenu() {
		System.out.println("""
				Available actions (select word or letter):
				(F)orward
				(B)ackward
				(L)ist Places
				(M)enu
				(Q)uit
				""");
	}
	
	public static void addPlace(Place place) {
		if(places.contains(place)) return;
		int index = 0;
		for(Place p : places) {
			if(place.getDistance() < p.getDistance()) {
				places.add(index, place);
				return;
			}
			index++;
		}
		places.add(place);
	}

}
