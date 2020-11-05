package collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * A Java class that accepts a character array and count the number of times
 * each character is present in the array.
 * 
 * @author Suparna Arya
 *
 */
public class CountCharacter {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of characters you want");
		int size = sc.nextInt();
		char[] ch = new char[size];
		// It takes character array as an input.
		System.out.println("Enter the character elements of the array");
		for (int i = 0; i < size; i++) {
			ch[i] = sc.next().charAt(0);
		}

		Map<Character, Integer> countedChar = new HashMap<>();
		// It calls the countChars() method.
		countedChar = countChars(ch);
		System.out.println(countedChar);
		sc.close();
	}

	/**
	 * method that accepts a character array and count the number of times each
	 * character is present in the array.
	 * 
	 * @param ch
	 * @return
	 */
	private static Map<Character, Integer> countChars(char[] ch) {
		int count[] = new int[ch.length];
		int counter;
		// count occurrence of a character.
		Map<Character, Integer> countedChar = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			counter = 0;
			for (int j = 0; j <= i; j++) {

				if (ch[i] == ch[j]) {

					counter++;

				}
				count[i] = counter;

			}
			// put the character with its occurrence inside the map.
			countedChar.put(ch[i], count[i]);
		}

		return countedChar;
	}

}
