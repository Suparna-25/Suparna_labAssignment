
/**
 * Desc:Java program that which accepts a String and replaces all the consonants in the String with the next alphabet. 
 * @author:Suparna
 * date:24/10/2020
 */
import java.util.Scanner;

public class AlterStringConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string you want");
		String str = sc.nextLine();
		String word = alterString(str);
		System.out.println("new string is " + word);
		sc.close();
	}

	private static boolean isConsonant(char ch) {
		/*
		 * checks the consonants present inside the string
		 * 
		 * @param ch:It takes character as input
		 * 
		 * @return boolean value after checking whether it is consonant or not.
		 */
		// TODO Auto-generated method stub
		char c = Character.toLowerCase(ch);
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
			return true;
		return false;
	}

	private static String alterString(String str) {
		// TODO Auto-generated method stub
		/*
		 * It alter the string taken as input by replacing the consonant with its next
		 * alphabetic ordered character in the string
		 * 
		 * @param str:takes provided string as input
		 */
		char[] letters = str.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			if (isConsonant(letters[i])) {

				letters[i] = (char) (letters[i] + 1);// provides next alphabet for consonant
			}

		}
		return String.valueOf(letters);
	}

}
