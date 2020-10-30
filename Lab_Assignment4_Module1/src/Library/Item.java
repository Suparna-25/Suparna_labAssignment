/* 
 * This class describes all the details of a item present in library
 * @author:Suparna Arya
 */
package Library;
abstract class Item {
	/*
	 * It describes unique id of the item
	 */
    protected int id;
    /*
	 * It describes the title of the item
	 */
    protected String title;
    /*
   	 * It describes the no of copies of the item
   	 */
    protected int copies;
    
    /*
     *This abstract print method need to be override by its child class and print values of the class attributes
     */
    abstract String print();
    
    /*
     * This constructor initialize all the attributes of item and it's parent class 
     */
    
    public Item(int id, String title, int copies) {
        super();
        this.id=id;
        this.title=title;
        this.copies=copies;

    }
    /*
     * This constructor initialize all the attributes of it's parent class with default value
     */
    
    public Item() {
        super();
    }
    /*
     * All the setters and getters of item class is described below
     */
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
    /*
     * This method overrides the toString method
     */
    public String toString() {
        return "Item [id=" + id + ", title=" + title + ", copies=" + copies + "]";
    }

    @Override
    /*
     * This method overrides the hashCode method
     */
    public int hashCode() {
            int hashValue=this.hashCode();
        return hashValue;
    }

    @Override
    /*
     * This method overrides the equals method
     * @param obj:object of the class Object
     */
    public boolean equals(Object obj) {
        if(obj==this)
            return true;
        if(!(obj instanceof Item))
            return false;
        Item i=(Item) obj;
        return (Integer.compare(id,i.id)==0 && (title.compareTo(i.title))==0 && Integer.compare(copies,i.copies)==0);
    }

}

