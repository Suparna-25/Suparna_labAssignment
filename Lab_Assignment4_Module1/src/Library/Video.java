/* 
 * This class describes all the details of a video present in library
 * @author:Suparna Arya
 */
package Library;
/* 
 * This class extends Media item 
 */
public class Video extends MediaItem {
    protected String director;
    /*
     * This constructor initialize all the attributes of Video and it's parent class
     */
    public Video(int id, String title, int copies, int yearOfRelease, String genre, String director) {
     super(id,title,copies,yearOfRelease,genre);
     this.director=director;
    }

    /*
     * All the setters and getters are described below
     */
    public String getDirector() {
       return director;
    }

    public void setDirector(String director) {
        this.director=director;
    }

    @Override
    /*
     * This method overrides Media item's print() method
     */
    public String print() {
    	super.print();
    	return(" director: "+this.getDirector());

    }
    /*
     * This constructor initialize all the attributes of Video and it's parent class with default value
     */
    public Video() {
    	super();
    	director=null;

    }


}
