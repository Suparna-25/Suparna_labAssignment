package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * A Java class which accepts an array of integer elements and return the second
 * smallest element in the array
 * 
 * @author Suparna Arya
 *
 */

public class SecondSmallestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of integer you want");
		int size = sc.nextInt();
		int[] num = new int[size];
		// It takes integer array as an input
		System.out.println("Enter the elements in the array");
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		// It calls the secondSmallest() method
		int secondSmallest = getSecondSmallest(num);
		System.out.println("Second smallest element in the array " + secondSmallest);
		sc.close();
	}

	/**
	 * Get the second smallest element in the array
	 * 
	 * @param num
	 * @return
	 */
	private static int getSecondSmallest(int[] num) {
		List<Integer> numbers = new ArrayList<>();
		// Add integer array into a list
		int secondSmallest = 0;
		for (int i = 0; i < num.length; i++) {
			numbers.add(num[i]);
		}
		// Sort the list and return the second smallest element in the array
		Collections.sort(numbers);
		secondSmallest = numbers.get(1);

		return secondSmallest;
	}

}
