package collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * A Java class which accepts the marks of students as a Hashmap and return the
 * details of the students eligible for the medals along with type of medal.
 * 
 * @author Suparna Arya
 *
 */
public class MedalEligibiltyMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// The input Hashmap contains the student registration number as key and mark as
		// value.
		System.out.println("Enter the number of students you want");
		int size = sc.nextInt();
		Map<Integer, Integer> marksMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the Student Id:");
			int id = sc.nextInt();
			System.out.println("Enter the Student's marks");
			int marks = sc.nextInt();
			marksMap.put(id, marks);
		}
		Map<Integer, String> medalMap = new HashMap<Integer, String>();
		// It calls the getStudent() method.
		medalMap = getStudent(marksMap);
		// The output Hash map should contain the student registration number as key and
		// the medal type as value.
		System.out.println("Students egilible to get Medal are " + medalMap);
		sc.close();

	}

	/**
	 * Generate the list of students eligible for scholarship
	 * 
	 * @param marksMap
	 * @return
	 */
	private static Map<Integer, String> getStudent(Map<Integer, Integer> marksMap) {
		Map<Integer, String> medalMap = new HashMap<Integer, String>();
		String medal = "";
		// It return the details of the students eligible for the medals along with the
		// medal type.
		for (Map.Entry<Integer, Integer> m : marksMap.entrySet()) {
			if (m.getValue() >= 90) {
				medal = "Gold";
			} else if (m.getValue() < 90 && m.getValue() >= 80) {
				medal = "Silver";
			} else if (m.getValue() < 80 && m.getValue() >= 70) {
				medal = "Bronze";
			}
			// It put student id and medal type inside a hash map.
			medalMap.put(m.getKey(), medal);
		}
		return medalMap;
	}

}
