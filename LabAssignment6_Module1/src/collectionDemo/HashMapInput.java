package collectionDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Desc:A Java class takes hash map as an input and provide sorted list as
 * output
 * 
 * @author Suparna Arya
 *
 */

public class HashMapInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element you want inside map?");
		Map<Integer, String> map = new HashMap<>();
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			// Provide the key for Map
			System.out.println("Enter the key you want");
			int key = sc.nextInt();
			sc.nextLine();
			// Provide the value for Map
			System.out.println("Enter the value you want");
			String value = sc.nextLine();
			map.put(key, value);
		}
		// Prints the given map
		System.out.println("MAP BEFORE SORTING" + map);
		List<String> sortedList = new ArrayList<String>();
		//It calls the sortedMap() method-to return the list of the sorted map values.
		sortedList = sortedMap(map);
		// Prints the sorted map
		System.out.println("SORTED LIST" + sortedList);
		sc.close();

	}

	/**
	 * It takes hashmap as an input and sort it's value and it returns a sorted list
	 * 
	 * @param map
	 * @return
	 */
	public static List<String> sortedMap(Map<Integer, String> map) {
		List<String> sorted = new ArrayList<>();
		// It sorts the map
		Map<Integer, String> sortedMap = new TreeMap<>(map);
		for (Map.Entry<Integer, String> m : sortedMap.entrySet()) {
			// It adds the values of the sorted map in a list.
			sorted.add((m.getValue()));
		}

		return sorted;
	}

}
