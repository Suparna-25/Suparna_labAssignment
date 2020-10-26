/**
 * Desc:Java program that accepts url as an input and return command as a string.
 * @author:Suparna
 * date:24/10/2020
 */
import java.util.Scanner;
public class CommandDetectionClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the url you want:");
		String url=sc.nextLine();
		String command=getCommand(url);
		System.out.println("Command inside the url is:"+command);
	}

	private static String getCommand(String url) {
		// TODO Auto-generated method stub
		String[] characters=url.split("/");	//splits string url based on "/"
		String command=null;
		for(int i=0;i<characters.length;i++)
		{
			if(characters[i].contains(".")) //checks whether character array element contains "."
			{
        		
				String com=characters[i];
				String[] commands=com.split("\\."); //splits the character element containing "." based on "."
				 command=commands[0];
				 return command; //returns the first element of commands
				
			}
		}
		return command;
		
	}

}
