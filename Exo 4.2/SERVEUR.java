import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class SERVEUR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SERVEUR
{
    private String serv;
    private List<String>clientco;

    /**
     * Constructor for objects of class SERVEUR
     */
    public SERVEUR(final String serv)
    {
		this.serv = serv;
		clientco = new ArrayList<String>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean connecter(String nom)
    {
		clientco.add(nom);
		return true;
    }
    
    public void diffuser(String message)
    {
		
	}
}
