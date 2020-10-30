
/**
 * Desc:A java program that can accept an array of String objects and sort in 
 * alphabetical order. The elements in the left half should be completely in 
 * uppercase and the elements in the right half should be completely in lower case.
 *  Return the resulting array
 * @author Suparna Arya
 * Date:23/11/2020
 *
 */
import java.util.*;

public class AlphabeticOrderSorting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		sc.close();
		int i;

		String arr[] = new String[size];
		System.out.println("Enter the elements of the array");
		for (i = 0; i < size; i++) {
			arr[i] = sc.next();
		}
		/*
		 * Sort the string in alphabetic order
		 */
		String[] sortedArray = sortStrings(arr, size);
		System.out.println("Sorted array is:");
		for (i = 0; i < size; i++) {
			System.out.print(sortedArray[i]);
		}
	}

	/**
	 * Generates sorted array
	 * 
	 * @param arr  takes array of string as input
	 * @param size takes size of the array
	 * @return sorted array with right half in uppercase and left half in lowercase
	 */
	private static String[] sortStrings(String[] arr, int size) {
		// TODO Auto-generated method stub
		String sortedArray[] = new String[size];
		Arrays.sort(arr);
		int i, n1;
		/*
		 * Divides the string in two halves
		 */
		if (size % 2 != 0) {
			n1 = (size / 2) + 1;
		} else {
			n1 = (size / 2);
		}
		/*
		 * Right side of the half is in upper case
		 */
		for (i = 0; i < n1; i++) {
			sortedArray[i] = arr[i].toUpperCase();
		}
		/*
		 * Left side of the half is in upper case
		 */
		for (i = n1; i < size; i++) {
			sortedArray[i] = arr[i].toLowerCase();
		}
		return sortedArray;
	}

}
