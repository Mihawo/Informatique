import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.time.*;

public class Magasin implements Observable {
	private String nomMagasin;
	private String nomVille;
	public LinkedList<Produit> liste;
	public LinkedList<Observateur> obs;

	public Magasin(String nm, String nv){
		this.nomMagasin=nm;
		this.nomVille=nv;
		this.liste = new LinkedList<Produit>();
		this.obs = new LinkedList<Observateur>();
	}

	public float detruireProduit(int codeProduit, LocalDate aujourdhui){
		float prix = 0f;
		Produit P;
		Usine U = null;
		for(int i=0; i<liste.size(); i++){
			P = liste.get(i);
			if(P.getDate().isBefore(aujourdhui)){
				if(P.getClass().getName() == "Choucroute" && codeProduit == CodeProduit.choucroute){
					prix += 3.40f;
					liste.remove(i);
					U = P.getUsine();
					i--;
				}
				if(P.getClass().getName() == "Lasagne" && codeProduit == CodeProduit.lasagne){
					prix += 3.20f;
					liste.remove(i);
					U = P.getUsine();
					i--;
				}
				if(P.getClass().getName() == "Poele" && codeProduit == CodeProduit.poele){
					prix += 3.90f;
					liste.remove(i);
					U = P.getUsine();
					i--;
				}
			}
		}

		if(U!=null){
			for (int i = 0 ; i < obs.size() ; i++) {
				obs.get(i).evenementProduitVendu(this,U,codeProduit,aujourdhui);
			}
		}
		return prix;
	}

	public void ajouterProduit(Produit produit){
		int i=0;
		if(!liste.isEmpty()){
			while(produit.dateLimite.isBefore(liste.get(i).dateLimite)&&liste.size()<i){
				i++;
			}
		}
		liste.add(i,produit);
		//tant que la date limite du produit est avant la date d'un produit
	}

	public void ajouterObservateur(Observateur o){
		obs.add(o);
	}
	public void supprimerObservateur(Observateur o){
		obs.remove(o);
	}

	public float vendreProduit(int codeProduit, int quantite, LocalDate aujourdhui){
		int count = 0;
		float prix = 0f;
		Produit P;
		Usine U = null;
		for (int i = 0 ; i < liste.size() ; i++) {
			P = liste.get(i);
			if(count < quantite && P.getDate().isAfter(aujourdhui)){
				if(P.getClass().getName() == "Choucroute" && codeProduit == CodeProduit.choucroute){
					prix += 3.40f;
					liste.remove(i);
					i--;
					U = P.getUsine();
					count++;
				}
				if(P.getClass().getName() == "Lasagne" && codeProduit == CodeProduit.lasagne){
					prix += 3.20f;
					liste.remove(i);
					i--;
					U = P.getUsine();
					count++;
				}
				if(P.getClass().getName() == "Poele" && codeProduit == CodeProduit.poele){
					prix += 3.90f;
					liste.remove(i);
					i--;
					U = P.getUsine();
					count++;
				}
			}		
		}
		for (int i = 0 ; i < obs.size() ; i++) {
			obs.get(i).evenementProduitVendu(this,U,codeProduit,aujourdhui);

		}

		return prix;
	}

	public String getVille(){
		return this.nomVille;
	}

	public String getMagasin(){
		return this.nomMagasin;
	}

	public void setMagasin(String magasin, String ville){
		this.nomMagasin = magasin;
		this.nomVille = ville;
	}

	public String toString(){
		return "Le magasin " +nomMagasin+ ", de la ville " +nomVille;
	}
}