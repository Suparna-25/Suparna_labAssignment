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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int numbers=sc.nextInt();
		
		int diff=modifyNumber(numbers);
		System.out.println(diff);
		   
	}
	private static int modifyNumber(int number) {
		// TODO Auto-generated method stub

		int num1=0,num2=0;
		int newNum=0;int difference=0;
		StringBuffer sb=new StringBuffer();
		String string=Integer.toString(number);
		
		for(int i=0;i<string.length()-1;++i)
		{
    		 num1=string.charAt(i)-'0';	
    		 if(i<string.length())
    		    num2=string.charAt(i+1)-'0';	
		
	
		 difference=Math.abs(num1-num2);
		sb.append(difference);
		}
		sb.append(string.charAt(string.length()-1));
		newNum=Integer.parseInt(sb.toString());
		return newNum;
	}
}