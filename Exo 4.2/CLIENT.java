/**
 * Write a description of class CLIENT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CLIENT
{
    public String nom;
    private boolean co;

    /**
     * Constructor for objects of class CLIENT
     */
    public CLIENT(String nom)
    {
		this.nom = nom;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean seConnect(String serveur)
    {
		return co = true;
    }
    
    public void envoyer(String message)
    {
		
	}
	
	public StringBuilder recevoir(String message)
	{
		StringBuilder recu = new StringBuilder();
		int i;
		for(i=0; i<recu.length(); i++)
		{
			recu.append(message.charAt(i));
		}
		return recu;
	}
}
