/**
 * Desc: A Java program that displays the number of characters, lines and words
 * in a text
 * 
 * @author:Suparna date:24/10/2020
 */
public class CountOfCharacters {
	public static void main(String[] args) {

		/*
		 * Takes the text as input
		 */
		String para = "I am Suparna Arya\nI am from Kolkata\nI love animals";
		;
		int c = 1, count = 1, countLine = 1;

		for (int i = 0; i < para.length(); i++) {
			c++;
			if (para.charAt(i) == ' ' || para.charAt(i) == '\n') {
				count++;
			}
			if (para.charAt(i) == '\n') {
				countLine++;
			}
		}
		/*
		 * Displays the count of character,words and line
		 */
		System.out.println("Number of characters" + c);
		System.out.println("Number of words" + count);
		System.out.println("Number of lines" + countLine);
	}

}
