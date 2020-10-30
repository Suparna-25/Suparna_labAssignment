/* 
 * This class describes all the details of a CD present in library
 * @author:Suparna Arya
 */
package Library;

/*
 * This class has Media Item as it's parent
 */
public class CD extends MediaItem {

	/*
	 * It describes about the artist of the CD
	 */
    protected String artist;
    /*
     * This constructor initialize all the attributes of CD and it's parent class with a default value
     */
    public CD() {
        super();
        artist = null;
    }
    
    /*
     * This constructor initialize all the attributes of CD and it's parent class 
     */

    public CD(int id, String title, int copies, int yearOfRelease, String genre, String artist) {
        super(id,title,copies,yearOfRelease,genre);
        this.artist=artist;
        
        
    }

    /*
     * All the setters and getters of Class CD is described below
     */
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist=artist;
    }

    @Override
    /*
     * This method overrides Media item's print() method
     */
    public String print() {
        super.print();
        return("artist: " + this.getArtist());
    }

}
