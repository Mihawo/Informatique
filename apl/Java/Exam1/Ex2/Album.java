import java.time.*;
import java.util.*;

public class Album {
    private String nom;
    private Artiste artiste;
    private ArrayList<Titre> liste;

    public Album(String n, Artiste al){
	this.nom=n;
	this.artiste=al;
    }
    
    public String getNom(){
	return this.nom;
    }
    
    public Artiste getArtiste(){
	return this.artiste;
    }

    public void setNom(String n){
	this.nom=n;
    }

    public void setArtiste(Artiste al){
	this.artiste=al;
    }
}