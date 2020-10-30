/* 
 * This class describes all the details of a Journal Paper present in library
 * @author:Suparna Arya
 */
package Library;

public class JournalPaper extends WrittenItem {
    protected int yearPublished;
    /*
     * This constructor initialize all the attributes of Journal class and it's parent class 
     */
    public JournalPaper(int id, String title, int copies, String authorName, String publicationName, int noOfPages,
                        int yearPublished) {
                            super(id,title,copies,authorName,publicationName,noOfPages);
                            this.yearPublished=yearPublished;
        
    }
    /*
     * This method overrides Written item's print() method
     */
    @Override
    String print() {
        return ("JournalPaper [yearPublished=" + yearPublished + ", authorName=" + authorName
                + ", publicationName=" + publicationName + ", noOfPages=" + noOfPages + ", id=" + id + ", title="
                + title + ", copies=" + copies + "]");

    }
    /*
     * All the setters and getters are described below
     */
    public int getYearPublished() {
        return yearPublished;

    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished=yearPublished;
    }

    public JournalPaper() {
        super();
        yearPublished=0;
    }

}