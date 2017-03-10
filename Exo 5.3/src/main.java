import java.util.ArrayList;
import java.util.List;
import doc.*;
import java.io.*;
import java.util.*;

public class main
{
	public static void main(String[] args)
	{
		fichier A = new fichier("babar", 2);
		fichier B = new fichier("toto", 4);
		repertoire R = new repertoire("test");
		
		R.creat_file(A);
	}
}
