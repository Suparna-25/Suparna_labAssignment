package collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * A Java class which accepts an array of numbers and returns the numbers and
 * their squares in Hashmap
 * 
 * @author Suparna Arya
 *
 */
public class SquareMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] num = new int[size];
		// It takes integer array as an input
		System.out.println("Enter the element of the array");
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		Map<Integer, Integer> sqMap = new HashMap<>();
		// It calls the getSquare() method.
		sqMap = getSquare(num);
		System.out.println("Square Map" + sqMap);
		sc.close();
	}

	/**
	 * Accepts a list of numbers and return their squares
	 * 
	 * @param num
	 * @return
	 */
	private static Map<Integer, Integer> getSquare(int[] num) {
		int[] square = new int[num.length];
		/*
		 * Iterate through the list, find the square of each number and add the elements
		 * to a map object with the number as the key and the square as the value
		 */
		Map<Integer, Integer> sqMap = new HashMap<>();

		for (int i = 0; i < num.length; i++) {
			square[i] = num[i] * num[i];
			sqMap.put(num[i], square[i]);
		}

		return sqMap;
	}

}
