import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.time.*;

public abstract class Produit {
	protected float poids;
	protected float coutFabrication;
	protected float prixVente;
	protected LocalDate dateLimite;
	private Usine usine;

	public Produit(float poids, float cout, float prix, LocalDate date, Usine usin){
		if(poids >= 0){
			this.poids = poids;
		}
		if(coutFabrication >= 0){
			this.coutFabrication = cout;
		}
		this.prixVente = prix;
		
		this.dateLimite = date;
		this.usine = usin;
	}

	public void setPrix(int prix){
		this.prixVente = prix;
	}

	public float getPoids(){
		return this.poids;
	}
	public float getCout(){
		return this.coutFabrication;
	}
	public float getPrix(){
		return this.prixVente;
	}

	public Usine getUsine(){
		return this.usine;
	}

	public LocalDate getDate(){
		if(this.getClass().getName() == "Poele")
			return this.dateLimite.plusMonths((usine.getNomU().length() * usine.getNomU().length()));
		else if (this.getClass().getName() == "Lasagne") {
			if(this.dateLimite.getMonthValue()==6)
				return this.dateLimite.plusMonths(9);
			else if(this.dateLimite.getMonthValue()==1 && this.dateLimite.getDayOfMonth()==10)
				return this.dateLimite.plusYears(69);
		}
		return this.dateLimite;
	}

	public String nom(){
		if(this.getClass().getName() == "Choucroute"){
			return "Choucroute";
		}
		if(this.getClass().getName() == "Lasagne"){
			return "Lasagne";
		}
		else{
			return "Poele";
		}
	}

	public String toString(){
		return this.nom()+" / poids : "+poids+" / prix vente : "+prixVente+" euros / date de péremption : "+this.getDate()+" "+usine.toString();
	}
}
