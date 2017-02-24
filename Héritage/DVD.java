
/**
 * Write a description of class DVD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DVD extends DOC
{
    // instance variables - replace the example below with your own
    private String title;
    private String Autor;
    private int year;

    /**
     * Constructor for objects of class DVD
     */
    public DVD(String title, String Autor, int year)
    {
        this.title = title;
        this.Autor = Autor;
        this.year = year;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void info(){
        System.out.println(this.title);
        System.out.println(this.Autor);
        System.out.println(this.year);
    }
    
    public boolean verif(String clef){
        if(clef == this.Autor)
            return true;
        else 
            return false;
    }
    
    @Override
    public String toString()
    {
        return title + " " + Autor + ", " + year;
    }
}
