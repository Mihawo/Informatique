import java.time.*;
import java.util.*;

public class Playliste{
    private ArrayList<Titre> liste;
    
    public int comparerUn(Titre a,Titre b){
	String nomA=a.getNom();
	String nomB=b.getNom();

	return nomA.compareTo(nomB);
    }

    public int comparerDeux(Titre a,Titre b){
	return 0;
    }
}