package src;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10, 2, 32, 11, 44, 24, 3};
		
		System.out.println(Arrays.toString(numbers));
		reverseArray(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void reverseArray(int[] array) {
		int temp;
		
		for(int i = 0; i < array.length/2; i++) {
			temp  = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		
	}

}
