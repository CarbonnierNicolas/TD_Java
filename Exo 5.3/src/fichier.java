package doc;

public class fichier extends file
{
	private int taille;
	private String nom;

	public fichier(String nom, int taille)
	{
		this.taille = taille;
		this.nom = nom;
	}
	
	public int taille()
	{
		return taille;
	}
	
	public String name()
	{
		return nom;
	}
	
	public boolean checkboolean(file fich)
	{
		return true;
	}
	
	@Override
	public String toString()
	{
		return nom + taille;
	}
}
