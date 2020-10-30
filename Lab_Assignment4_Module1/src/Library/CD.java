/* 
 * This class describes all the details of a CD present in library
 * @author:Suparna Arya
 */
package Library;

public class CD extends MediaItem {

    protected String artist;

    public CD() {
        super();
        artist = null;
    }

    public CD(int id, String title, int copies, int yearOfRelease, String genre, String artist) {
        super(id,title,copies,yearOfRelease,genre);
        this.artist=artist;
        
        
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist=artist;
    }

    @Override
    public String print() {
        super.print();
        return("artist: " + this.getArtist());
    }

}
