import java.time.*;
import java.util.*;

public class Titre {
    private String nom;
    private Artiste artiste;
    private Album album;

   public Titre(String n,Artiste a,Album al){
	this.nom=n;
	this.artiste=a;
	this.album=al;
    }

    public String getNom(){
	return this.nom;
    }

    public Artiste getArtiste(){
	return this.artiste;
    }

    public Album getAlbum(){
	return this.album;
    }
}