/**
 * Desc:Java program that a method to check if a number is an increasing number
 * @author:Suparna Arya
 * date:22/10/2020
 */
import java.util.Scanner;
public class IncreasingNumberAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want");
		int number=sc.nextInt();
		sc.close();
		boolean check=checkNumber(number);
		if(check)
		{
			System.out.println(number+" is a non-increasing number");
		}
		else
		{
			System.out.println(number+" is a increasing number");
		}

	}

	private static boolean checkNumber(int number) {
		// TODO Auto-generated method stub
		
			int curr_dig=number%10;
			number=number/10;
			while(number>0)
			{
			  if(curr_dig<=number%10)
			{
				return true;
			}
			  curr_dig=number%10;
			  number=number/10;
		}
		return false;
	}
	

}
