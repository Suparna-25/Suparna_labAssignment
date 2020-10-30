/* 
 * This class describes all the details of a written item present in library
 * @author:Suparna Arya
 */package Library;

abstract class WrittenItem extends Item {
    protected String authorName;
    protected String publicationName;
    protected int noOfPages;

    public WrittenItem(int id, String title, int copies, String authorName, String publicationName, int noOfPages) {
    super(id,title,copies);
    this.authorName=authorName;
    this.noOfPages=noOfPages;
    }

    abstract String print();

    public String getAuthorName() {
        return authorName;

    }

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