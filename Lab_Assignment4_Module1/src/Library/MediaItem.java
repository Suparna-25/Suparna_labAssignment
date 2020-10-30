/* 
 * This class describes all the details of a media item present in library
 * @author:Suparna Arya
 */
package Library;
/*
 * This class extends Item class and it is itself an abstract class that cannot be instantiated.
 */
abstract public class MediaItem extends Item {
    protected int yearOfRelease;
    protected String genre;
    /*
     * This constructor initialize all the attributes of Media Item and it's parent class 
     */
    public MediaItem(int id, String title, int copies, int yearOfRelease, String genre) {
      super(id,title,copies);
      this.yearOfRelease=yearOfRelease;
      this.genre=genre;
    }
    /*
     * This constructor initialize all the attributes of Media Item and it's parent class with default value
     */
    public MediaItem() {
        super();
        yearOfRelease=0;
        genre=null;

    }
    /*
     * All the setters and getters are described below
     */

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease=yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre=genre;
    }

    @Override
    /*
     * This method overrides item's print() method
     */
    public String print() {
     return ("MediaItem [yearOfRelease=" + yearOfRelease + ", genre=" + genre
                + ", id=" + id + ", title=" + title + ", copies=" + copies + "]");
    }

}
