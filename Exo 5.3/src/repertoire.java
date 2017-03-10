package doc;
import java.util.ArrayList;
import java.util.List;

public class repertoire extends file
{
	private String name;
	private List<file> list_fichier;
	private boolean x;
	
	public repertoire(String name)
	{
		list_fichier = new ArrayList<file>();
		this.name = name;
	}
	
	public void creat_file(file fich)
	{
		x = checkboolean(fich);
		if(x == true)
		{
			list_fichier.add(fich);
			System.out.println("file add");
		}
		else
		{
			System.out.println("error");
		}
	}
	
	public int taille()
	{
		int i;
		int tailletotale = 0;
		for(i=0; i<list_fichier.size(); i++)
		{
			tailletotale = tailletotale + list_fichier.get(i).taille();
		}
		return tailletotale;
	}
	
	public String name()
	{
		return name;
	}
	
	public boolean checkboolean(file fich)
	{
		int i;
		if(this.name == fich.name())
		{
			return false;
		}
		for(i=0; i<list_fichier.size(); i++)
		{
			if(list_fichier.get(i).checkboolean(fich))
			{
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString()
	{
		return list_fichier + name + "  ";
	}
}
