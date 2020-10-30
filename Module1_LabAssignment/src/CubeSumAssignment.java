
/**
 * Desc:To find the sum of the cubes of the digits of an n digit number
 * @author:Suparna Arya
 * date:22/10/2020
 */
import java.util.Scanner;

public class CubeSumAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result = 0;
		System.out.println("Enter the number you want:");
		int num = sc.nextInt();
		sc.close();
		while (num > 0) {
			int digit = getDigit(num);
			result += cubeSum(digit);
			num = num / 10;
		}
		System.out.println("Sum=" + result);

	}

	/**
	 * Generates digit for a number
	 * 
	 * @param num
	 * @return digit of the number
	 */
	private static int getDigit(int num) {
		// TODO Auto-generated method stub
		int dig = 0;
		dig = num % 10;
		return dig;

	}

	/**
	 * Generate sum of the cubes of the digits
	 * 
	 * @param digit
	 * @return sum
	 */
	private static int cubeSum(int digit) {
		// TODO Auto-generated method stub

		int res = digit * digit * digit;
		return res;
	}

}
