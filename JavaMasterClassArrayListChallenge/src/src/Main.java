package src;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);;
		int choice = -1;
		ArrayList<String> groceryList = new ArrayList<>();
		String s;
		
		while(choice != 0) {
			System.out.println("Available actions:");
			System.out.println("0 - to shutdown");
			System.out.println("1 - to add item(s) to list (comma delimited list)");
			System.out.println("2 - to remove any items (comma delimited list)");
			System.out.println("Enter a number for which action you want to do:");
			 
			choice = Integer.parseInt(scanner.nextLine());
			
			switch(choice) {
				case 0: break;
				case 1: s = scanner.nextLine(); addItems(groceryList, s); break;
				case 2: s = scanner.nextLine(); removeItems(groceryList, s); break;
				default: choice = 0;
			}
			
			System.out.println(groceryList);
		}
		
		
	}
	
	public static void addItems(ArrayList<String> list, String itemsString) {
		var items = List.of(itemsString.split(","));
		String trimmed;
		
		for(String s : items) {
			trimmed = s.trim();
			if(!list.contains(trimmed)) list.add(trimmed);
		}
		
		list.sort(Comparator.naturalOrder());
		
	}
	
	public static void removeItems(ArrayList<String> list, String itemsString) {
	
		var items = List.of(itemsString.split(","));
		String trimmed;
	
		for(String s : items) {
			trimmed = s.trim();
			list.remove(trimmed);
		}

	}
	
}
