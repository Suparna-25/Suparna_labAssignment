/**
 * Desc:Java program that reads a line of integers and then displays
 *  each integer and the sum of all integers. (Use String Tokenizer class)?
 * @author:Suparna
 * date:24/10/2020
 */
import java.util.Scanner;
public class MirrorImageClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		StringBuilder word=new StringBuilder();
		word.append(str);//Appending string inside string builder
		StringBuilder rev=new StringBuilder();
		rev.append(word);//creating the mirror image of the string
		rev=rev.reverse();
		word.append("|").append(rev);
		System.out.println("Mirror image string is "+word);
		
	}

}
