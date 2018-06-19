import java.time.*;
import java.util.*;

public class Artiste {
    private String nom;
    private ArrayList<Album> liste;

    public Artiste (String n){
	this.nom=n;
    }

    public String getNom() {
	return this.nom;
    }

    public void setNom(String n){
	this.nom=n;
    }
}

