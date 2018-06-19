import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.time.*;

public class SiegeMiamMiam{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";

	private LinkedList<Usine> Usin ;
	private LinkedList<Magasin> Magas;

	public SiegeMiamMiam(){
		this.Usin = new LinkedList<Usine>();
		this.Magas = new LinkedList<Magasin>();
	}

	public Magasin addM(String nm, String nv){
		Magasin m = new Magasin(nm,nv);
		Magas.add(m);
		return m;
	}

	public float detruireProduit(int codeProduit, LocalDate aujourdhui){
		float prix = 0f;
		for(int i=0; i<Magas.size(); i++){
			prix+=Magas.get(i).detruireProduit(codeProduit, aujourdhui);
		}
		return prix;
	}

	public Usine addU(String nu, String nv){
		Usine u = new Usine(nu,nv);
		Usin.add(u);
		return u;
	}

	public void afficher(LocalDate ajd){
		Magasin M;
		Produit P;

		System.out.println("La date aujourd'hui est : "+ajd);
		for(int i=0; i<Magas.size(); i++){
			M = Magas.get(i);
			System.out.println(M.toString());
			for(int j=0; j<M.liste.size();j++){
				P=M.liste.get(j);
				if(P.getDate().isBefore(ajd))
					System.out.println(ANSI_RED+"Le produit : " +P.toString()+ANSI_RESET);

				else
					System.out.println(ANSI_GREEN+"Le produit : " +P.toString()+ANSI_RESET);

			}
		}
	}
	public void afficher(){

	}
}