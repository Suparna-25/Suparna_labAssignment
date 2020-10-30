
/**
 * Desc:Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence
 * @author:Suparna Arya
 * date:22/10/2020
 */
import java.util.Scanner;

public class FibbonacciSeriesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms you want");
		int n = sc.nextInt();
		int m = 0;
		sc.close();
		System.out.println("Fibonacci Series Recursive=");
		for (int i = 1; i <= n; i++) {
			System.out.print(getFibRecursive(m) + ",");
			m++;
		}
		/**
		 * Non recursive Fibbonacci series
		 */
		System.out.println("\n Fibonacci Series Non-Recursive=");
		int a = 0, b = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(b + ",");
			int c = a + b;
			a = b;
			b = c;
		}

	}

	/**
	 * Recursive Fibbonacci series
	 * 
	 * @param n
	 * @return fibonacci series
	 */
	private static int getFibRecursive(int n) {
		// TODO Auto-generated method stub
		if (n <= 1)
			return 1;
		return getFibRecursive(n - 1) + getFibRecursive(n - 2);
	}

}
