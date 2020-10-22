/**
 * Desc:Java program with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
 * @author:Suparna Arya
 * date:22/10/2020
 */
import java.util.Scanner;
public class DifferenceSumSquareAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		int Sum=0;
		sc.close();
		Sum=calculateDifference(n);
		System.out.println("Sum of difference of the squares and square of the sum is"+Sum);

	}

	private static int calculateDifference(int n) {
		// TODO Auto-generated method stub
		int sumSq=0,sum=0;
		for(int i=1;i<=n;i++)
		{
		     sumSq+=i*i;
		     sum+=i;
		}
		int Sum=sumSq-(sum*sum);
		   return Sum;
	}

	
}
