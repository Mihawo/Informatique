import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.time.*;

public class Main{
	public static void main(String[] args) {
		SiegeMiamMiam siege = new SiegeMiamMiam();

		Magasin m =siege.addM("Carrefour", "Paris");
		Usine u =siege.addU("MiamFactory1", "Paris");
		Magasin m2=siege.addM("Leclerc", "Cergy");
		Usine u2 =siege.addU("MiamFactory2", "Cergy");


		LocalDate date=LocalDate.of(2018,Month.APRIL,15);
		LocalDate date2=LocalDate.of(2019,Month.APRIL,15);
		LocalDate datep=LocalDate.of(2009,Month.JANUARY,10);
		LocalDate datep2=LocalDate.of(2009,Month.JUNE,10);
		LocalDate datep3=LocalDate.of(2030,Month.JUNE,10);

		m.ajouterObservateur(u);
		m.ajouterObservateur(u2);
		m2.ajouterObservateur(u);
		m2.ajouterObservateur(u2);

		m.ajouterProduit(new Choucroute(date,u));
		m.ajouterProduit(new Choucroute(date2,u2));
		m.ajouterProduit(new Lasagne(date,u));
		m2.ajouterProduit(new Poele(datep,u2));
		m2.ajouterProduit(new Lasagne(datep2,u2));
		m2.ajouterProduit(new Poele(date,u));

		siege.afficher(date);

		System.out.println("On vend le produit Poele :");

		float prix = m2.vendreProduit(3,2,date);

		System.out.println("La vente à ramené "+prix+" euros");

		siege.afficher(date);

		siege.afficher(datep3);

		System.out.println("On detruit le produit Poele :");

		float monaie = siege.detruireProduit(3,datep3);

		System.out.println("On a détruit l'équivalent de " +monaie+ " euros");

		siege.afficher(datep3);

	}
}