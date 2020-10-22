/**
 * Desc:Java program with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
 * @author:Suparna Arya
 * date:22/10/2020
 */
import java.util.Scanner;
public class SumDivisibleby3or5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
      System.out.println("Enter the limit:");
      int n=sc.nextInt();
      sc.close();
      int sum=calcualteSum(n);
      System.out.println("Sum of first "+n+" numbers divisible by 3 or 5="+sum);
      
	}

	private static int calcualteSum(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			 if (i % 3 == 0 || i % 5 == 0) 
			 {
				 sum+=i;
			 }
				 
		}
			
		return sum;
	}

}
