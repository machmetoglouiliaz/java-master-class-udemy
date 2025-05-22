package src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[] array = r.ints(10, 0, 100).toArray();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
		int[] desArray = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			desArray[i] = array[array.length - 1 - i];
		}
		
		System.out.println(Arrays.toString(desArray));
	}

}
