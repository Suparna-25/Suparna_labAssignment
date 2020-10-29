package Library;

abstract public class MediaItem extends Item {
    protected int yearOfRelease;
    protected String genre;

    public MediaItem(int id, String title, int copies, int yearOfRelease, String genre) {
      super(id,title,copies);
      this.yearOfRelease=yearOfRelease;
      this.genre=genre;
    }

    public MediaItem() {
        super();
        yearOfRelease=0;
        genre=null;

    }

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
    public String print() {
     return ("MediaItem [yearOfRelease=" + yearOfRelease + ", genre=" + genre
                + ", id=" + id + ", title=" + title + ", copies=" + copies + "]");
    }

}
