/**
 * Desc:Java program that reads a line of integers and then displays
 *  each integer and the sum of all integers. (Use String Tokenizer class)?
 * @author:Suparna
 * date:24/10/2020
 */
import java.util.Scanner;
public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sequence of numbers");
		String numbers=sc.nextLine();
		String[] num=numbers.split("\\s");//splitting the string based on space 
		int sum=0;
		for(String n:num )
		{
			sum+=Integer.parseInt(n);//adding the array of string elements by parsing them into integer
		}
		System.out.println("Sum of the number sequence is "+sum);
		

	}

}
