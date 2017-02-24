

/**
 * Write a description of class Collection_de_CD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CD extends DOC
{
    private String title;
    private String nameAutor;
    private int songs;

    /**
     * Constructor for objects of class Collection_de_CD
     */
    public CD(String title, String nameAutor, int songs)
    {
        this.title = title;
        this.nameAutor = nameAutor;
        this.songs = songs;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void info(){
        System.out.println(this.title);
        System.out.println(this.nameAutor);
        System.out.println(this.songs);
    }
    
    
    public boolean verif(String clef){
        if(clef == this.nameAutor)
            return true;
        else
            return false;
    }
    
    @Override
    public String toString(){
        return title + " " + nameAutor + ", " + songs;
    }
}
