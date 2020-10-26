/**
 * Desc: A Java program that displays the number of characters, lines and words in a text
 * @author:Suparna
 * date:24/10/2020
 */
import java.util.*;
import java.io.*;
public class CountOfCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);           

         String para= "I am Suparna Arya\nI am from Kolkata\nI love animals";  ;
         int c=1,count=1,countLine=1;
        
         for(int i=0;i<para.length();i++) {
			  c++;
			if (para.charAt(i) == ' '||para.charAt(i) == '\n')
			{
				count++;
			}
			if(para.charAt(i) == '\n' )
			{ 
				countLine++;
			}
         }
		System.out.println("Number of characters"+c);
		System.out.println("Number of words"+count);
		System.out.println("Number of lines"+countLine);
	}

}
