import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class Livre {
  private String titre;
  private String auteur;
  private float prix;

  public Livre(String titre, String auteur, float prix) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}

	@Override
	public String toString() {
		return titre;
	}

	public String getTitre() {
		return this.titre;
	}

	public String getAuteur() {
		return this.auteur;
	}

	public float getPrix() {
		return this.prix;
	}
}
