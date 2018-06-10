import java.util.*;

public class SalleAttente {
	private String[] tab; // le tableau des personnes dans la salle
	private int in, out;
		
	public SalleAttente(int taille){
		this.tab = new String[taille];
		in = 0;
		out = 0;
	}
	
	public boolean faireEntrer(String nom){
		int outm1 = out - 1;
		if (outm1 < 0)
			outm1 = tab.length - 1;

		if (in == outm1) {
			return false;
		} else {
			tab[in] = nom;
			in = (in + 1) % tab.length;
		}
		return true;
	}
	
	public String faireSortir(){
		if (in == out)
			return null;
		
		String res = tab[out];
		out = (out + 1) % tab.length;
		
		return res;
	}
	
	public void afficherSalle(){
		System.out.println("Salle d'attente : ");
		int j = 1;
		for (int i = out; i != in; i = (i + 1) % tab.length, ++j)
			System.out.println("Personne num " + j + " : " + tab[i]);
		System.out.println("");
 	}	
} 