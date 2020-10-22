/**
 * Desc:Java program with that prompts the user for an integer and then prints out all the prime numbers up to that Integer
 * @author:Suparna Arya
 * date:22/10/2020
 */
import java.util.Scanner;
public class PrimeNumberAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit you want:");
		int limit=sc.nextInt();
		sc.close();
		System.out.println("Prime numbers=");
		for(int i=1;i<=limit;i++)
		{
			
		  int temp=getPrime(i);
		  if(temp==0)
		  {
			  System.out.print(i+",");
		  }
		 
		}
		
	}

	private static int getPrime(int num) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=2;i<=(num/2);i++)
		{
			if(num%i==0)
			{
				temp=1;
			}
		}
		return temp;
	}

}
