
/**
 * Desc:Java program that accepts a number and modifies it such that the each of the digit
 *  in the newly formed number is equal to the difference between two consecutive digits in the original number. 
 *  The digit in the units place can be left as it is.  
 * @author:Suparna
 * date:24/10/2020
 */
import java.util.*;

public class NewlyFormDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int numbers = sc.nextInt();

		int diff = modifyNumber(numbers);
		sc.close();
		System.out.println(diff);

	}

	/*
	 * It generates a new number containing difference of each consecutive digit
	 * difference and unit digit is left as it is
	 * 
	 * @param number:given number
	 * 
	 * @ return newNum:generated new number
	 */
	private static int modifyNumber(int number) {
		// TODO Auto-generated method stub

		int num1 = 0, num2 = 0;
		int newNum = 0;
		int difference = 0;
		StringBuffer sb = new StringBuffer();
		String string = Integer.toString(number);
		/*
		 * It convert given number into string buffer
		 */

		for (int i = 0; i < string.length() - 1; ++i) {
			/*
			 * take the integer value or the digit of the number at pos i and i+1
			 */
			num1 = string.charAt(i) - '0';
			if (i < string.length())
				num2 = string.charAt(i + 1) - '0';

			/*
			 * find the difference of the digits at pos i and i+1
			 */
			difference = Math.abs(num1 - num2);
			/*
			 * append the difference in the string buffer
			 */
			sb.append(difference);
		}
		/*
		 * append the unit digit in the string buffer
		 */
		sb.append(string.charAt(string.length() - 1));
		/*
		 * convert string buffer into number
		 */
		newNum = Integer.parseInt(sb.toString());
		return newNum;
	}
}