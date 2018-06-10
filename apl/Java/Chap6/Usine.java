import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.time.*;

public class Usine implements Observateur {
	private String nomUsine;
	private String nomVille;

	public Usine(String nu,String nv){
		this.nomUsine=nu;
		this.nomVille=nv;
	}

	public String getVille(){
		return this.nomVille;
	}

	public String getUsine(){
		return this.nomUsine;
	}
	public Produit produire(int codeProduit, LocalDate aujourdhui){
		if(codeProduit==CodeProduit.choucroute){
			Choucroute pro = new Choucroute(aujourdhui,this);
			return pro;
		}
		else if (codeProduit==CodeProduit.lasagne) {
			Lasagne pro = new Lasagne(aujourdhui,this);
			return pro;
		}
		else {
			Poele pro = new Poele(aujourdhui,this);
			return pro;
		}
	}


	public void evenementProduitVendu(Magasin m, Usine u, int codeProduit, LocalDate aujourdhui){
		int count = 0;
		Produit P;
		for (int i = 0 ; i < m.liste.size() ; i++) {
			P = m.liste.get(i);
			if(P.getDate().isAfter(aujourdhui)){
				if(P.getClass().getName() == "Choucroute" && codeProduit == CodeProduit.choucroute){
					count++;
				}
				if(P.getClass().getName() == "Lasagne" && codeProduit == CodeProduit.lasagne){
					count++;
				}
				if(P.getClass().getName() == "Poele" && codeProduit == CodeProduit.poele){
					count++;
				}
			}			
		}

		if(this.nomUsine == u.getNomU() && this.nomVille == u.getNomV() && count==0){
			for(int i=0;i<10;i++){
				m.ajouterProduit(this.produire(codeProduit,aujourdhui));
			}
		}
	}

	public String getNomU(){
		return this.nomUsine;
	}

	public String getNomV(){
		return this.nomVille;
	}

	public void setUsine(String usine, String ville){
		this.nomUsine = usine;
		this.nomVille = ville;
	}

	@Override
	public String toString(){
		return "Provient de l'usine " +nomUsine+ ", de la ville " +nomVille;
	}
}