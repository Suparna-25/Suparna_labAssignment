
/**
 * Desc:Java program that method to check if a number is a power of two or not
 * @author:Suparna Arya
 * date:22/10/2020
 */
import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want");
		int n = sc.nextInt();
		sc.close();
		boolean check = checkNumber(n);
		if (check)
			System.out.println(n + " is a power of 2");
		else
			System.out.println(n + " is not a power of 2");

	}

	/**
	 * Check whether a number is a power of 2
	 * 
	 * @param n
	 * @return
	 */
	private static boolean checkNumber(int n) {
		// TODO Auto-generated method stub
		if (n == 0)
			return false;
		while (n != 1) {
			n = n / 2;
			if (n % 2 != 0 && n != 1) {
				return false;
			}
		}
		return true;
	}

}
