import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Collection_de_CD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collection
{
    // instance variables - replace the example below with your own
    private List<CD> list_CD;
    private List<DVD> list_DVD;
    private boolean x;
    
    /**
     * Constructor for objects of class Collection_de_CD
     */
    public Collection()
    {
        list_CD = new ArrayList<CD>();
        list_DVD = new ArrayList<DVD>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void Add_CD(CD cd)
    {
        list_CD.add(cd);
    }
    
    public void Add_DVD(DVD dvd)
    {
        list_DVD.add(dvd);
    }
    
    public boolean check_CD(String clef){
        int i;
        
        for(i=0; i<list_CD.size(); i++){
            this.x = list_CD.get(i).verif(clef);
            if(x == true){
                System.out.println(x);
                return true;
            }
        }
        return false;
    }
    public String toString(){
        System.out.println(list_CD+ "\n");
        System.out.println(list_DVD+ "\n");
        return list_CD + "  " + list_DVD;
    }
}
