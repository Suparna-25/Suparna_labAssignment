package collectionDemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

/**
 * A Java class that which accepts the id and the age of people as a Map and
 * decide if they are eligible for vote. A person is eligible for vote if his
 * age is greater than 18. Add the IDs of all the eligible persons to list and
 * return the list
 * 
 * @author Suparna Arya
 *
 */
public class EligiblityToVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of people you want to enter");
		int size = sc.nextInt();
		// Accept a map with ID as key and age as value
		Map<String, Integer> people = new HashMap<>();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the id");
			String vId = "V";
			int id = sc.nextInt();
			vId += id;
			System.out.println("Enter the age");
			int age = sc.nextInt();
			people.put(vId, age);
		}

		List<String> voter = new Vector<>();
		System.out.println("People's List: " + people);
		// It calls the voterList() method-to get the list of eligible voters.
		voter = voterList(people);
		System.out.println("Voter List: " + voter);
		sc.close();

	}

	/**
	 * Generate the list of voters based on the ages of the people.
	 * 
	 * @param people
	 * @return
	 */
	private static List<String> voterList(Map<String, Integer> people) {
		List<String> voter = new Vector<>();
		// If the person is eligible his ID is added to the list.
		for (Map.Entry<String, Integer> m : people.entrySet()) {
			if (m.getValue() >= 18) {
				voter.add(m.getKey());
			}
		}

		return voter;
	}

}
