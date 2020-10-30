/* 
 * This class describes all the details of a item present in library
 * @author:Suparna Arya
 */
package Library;
abstract class Item {
    protected int id;
    protected String title;
    protected int copies;

    abstract String print();

    public Item(int id, String title, int copies) {
        super();
        this.id=id;
        this.title=title;
        this.copies=copies;

    }

    public Item() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title=title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies=copies;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", title=" + title + ", copies=" + copies + "]";
    }

    @Override
    public int hashCode() {
            int hashValue=this.hashCode();
        return hashValue;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this)
            return true;
        if(!(obj instanceof Item))
            return false;
        Item i=(Item) obj;
        return (Integer.compare(id,i.id)==0 && (title.compareTo(i.title))==0 && Integer.compare(copies,i.copies)==0);
    }

}

