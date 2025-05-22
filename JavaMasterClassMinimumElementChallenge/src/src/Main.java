package src;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] ns = readIntegers();
		System.out.println(Arrays.toString(ns));
		System.out.println(findMin(ns));
	}

	public static int[] readIntegers() {
		Scanner scanner = new Scanner(System.in);
		String[] numberStrings = scanner.nextLine().split(",");
		int[] numbers = new int[numberStrings.length];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(numberStrings[i].trim());
		}

		scanner.close();
		return numbers;
	}

	public static int findMin(int[] array) {

		int min = Integer.MAX_VALUE;

		for (int n : array) {
			if (n < min)
				min = n;
		}

		return min;
	}
}
