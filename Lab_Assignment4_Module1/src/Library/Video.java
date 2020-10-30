/* 
 * This class describes all the details of a video present in library
 * @author:Suparna Arya
 */
package Library;

public class Video extends MediaItem {
    protected String director;

    public Video(int id, String title, int copies, int yearOfRelease, String genre, String director) {
     super(id,title,copies,yearOfRelease,genre);
     this.director=director;
    }

    public String getDirector() {
       return director;
    }

    public void setDirector(String director) {
        this.director=director;
    }

    @Override
    public String print() {
    	super.print();
    	return(" director: "+this.getDirector());

    }

    public Video() {
    	super();
    	director=null;

    }


}
