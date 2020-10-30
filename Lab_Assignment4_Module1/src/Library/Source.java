/* 
 * This class describes all the display all the details of the item present in the library
 * @author:Suparna Arya
 */
package Library;

public class Source
{

    public static void main(String[] args) {
     JournalPaper j=new JournalPaper(123,"abc",5,"cde","xyz",23,2015);
     System.out.println("Journal "+j.print());
     CD c=new CD(231,"ABC",3,2013,"action","CDE");
     System.out.println("CD "+c.print());
     Video v=new Video(423,"eds",5,2019,"social","wer");
     System.out.println("Video "+v.print());

    }

}
