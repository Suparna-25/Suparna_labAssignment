/**
 * Desc: A Java program to accept date and print the duration in days, months and years with regards to current system date.
 * @author:Suparna
 * date:24/10/2020
 */
import java.util.*;
public class PositiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word you like");
		String word=sc.nextLine();
		char token[]=new char[word.length()];
		for(int i=0;i<word.length();i++) {
			token[i]=word.charAt(i);
		}
		Arrays.sort(token);
		if(word.equals(String.valueOf(token)))
		{
			System.out.println("Positive String");
		}
		else
		{
			System.out.println("Negative String");
		}
		
	}

}
