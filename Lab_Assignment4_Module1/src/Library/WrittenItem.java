/* 
 * This class describes all the details of a written item present in library
 * @author:Suparna Arya
 */package Library;
/*
 * This class extends Item class
 */
abstract class WrittenItem extends Item {
    protected String authorName;
    protected String publicationName;
    protected int noOfPages;
    /*
     * This constructor initialize all the attributes of Written item's and it's parent class
     */
    public WrittenItem(int id, String title, int copies, String authorName, String publicationName, int noOfPages) {
    super(id,title,copies);
    this.authorName=authorName;
    this.noOfPages=noOfPages;
    }
    /*
     * This method is abstract and need to be override by its child class to print all the attributes of the class
     */
    abstract String print();
    /*
     * All the setters and getters are described below
     */
    public String getAuthorName() {
        return authorName;

    }
    /*
     * This constructor initialize all the attributes of Written item's and it's parent class with default value
     */
    public WrittenItem() {
      super();
      authorName=null;
      publicationName=null;
      noOfPages=0;

    }

    public void setAuthorName(String authorName) {
       this.authorName=authorName;
    }

    public String getPublicationName() {
      return publicationName;
    }

    public void setPublicationName(String publicationName) {
        this.publicationName=publicationName;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages=noOfPages;
    }

}