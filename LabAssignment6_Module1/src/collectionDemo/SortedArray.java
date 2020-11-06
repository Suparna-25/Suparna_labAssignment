package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * A Java class which accepts an integer array, reverse the numbers in the array
 * and returns the resulting array in sorted order
 * 
 * @author Suparna Arya
 *
 */

public class SortedArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int array[] = new int[size];
		// It accepts and integer array,
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		// It prints the original array
		for (int i = 0; i < size; i++) {
			System.out.println("Given array " + array[i]);
		}
		// It calls the getSorted() method-to return the sorted array as an output.
		int sortedArray[] = getSorted(array);
		// It prints the sorted array
		for (int i = 0; i < size; i++) {
			System.out.println("Sorted array " + sortedArray[i]);
		}
		sc.close();
	}

	/**
	 * It returns the resulting array after reversing the numbers and sorting it
	 * 
	 * @param array
	 * @return
	 */
	private static int[] getSorted(int[] array) {
		List<Integer> list = new ArrayList<Integer>();
		int sortedArray[] = new int[array.length];
		// It adds the array elements inside a list
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		// It reverse the list
		Collections.reverse(list);
		// It sorts the reversed list
		Collections.sort(list);
		// It puts the sorted list values inside an integer array.
		for (int i = 0; i < list.size(); i++) {
			sortedArray[i] = list.get(i);
		}

		return sortedArray;
	}
}
