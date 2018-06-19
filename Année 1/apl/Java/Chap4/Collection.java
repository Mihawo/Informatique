import java.util.*;

class Vehicule {
	protected String marque;
	protected String modele;
	protected String couleur;	
	
	public Vehicule(String marque, String modele, String couleur) {
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
	}
		
	protected String type() {
		return "Non spécifié";
	}		
	
	public void afficher() {		
		System.out.println(type() + " " + marque + " " + modele + " " + couleur);
	}
	
	public boolean match(String marque, String modele, String couleur) {
		return this.marque.equals(marque) && this.modele.equals(modele) && this.couleur.equals(couleur);
	}
	
	@Override
	public boolean equals(Object obj) {
		Vehicule v;
		if (obj instanceof Vehicule) {
			v = (Vehicule) obj;
			return match(v.marque, v.modele, v.couleur);
		} else
			return false;
	}
}

class Auto extends Vehicule {
	
	public Auto(String marque, String modele, String couleur) {
		super(marque, modele, couleur);
	}	
		
	protected String type() {
		return "Auto";
	}
	
	@Override
	public boolean equals(Object obj) {
		Auto v;
		if (obj instanceof Auto) {
			v = (Auto) obj;
			return match(v.marque, v.modele, v.couleur);
		} else
			return false;
	}	
}

class Moto extends Vehicule {
	
	public Moto(String marque, String modele, String couleur) {
		super(marque, modele, couleur);		
	}

	protected String type() {
		return "Moto";
	}	

	@Override
	public boolean equals(Object obj) {
		Moto v;
		if (obj instanceof Moto) {
			v = (Moto) obj;
			return match(v.marque, v.modele, v.couleur);
		} else
			return false;
	}	
}

class Camion extends Vehicule {
	
	public Camion(String marque, String modele, String couleur) {
		super(marque, modele, couleur);		
	}
	
	protected String type() {
		return "Camion";
	}	
	
	@Override
	public boolean equals(Object obj) {
		Camion v;
		if (obj instanceof Camion) {
			v = (Camion) obj;
			return match(v.marque, v.modele, v.couleur);
		} else
			return false;
	}	
}

public class Collection {	
	private ArrayList<Vehicule> collec;

	public Collection() {
		collec = new ArrayList<Vehicule>();		
	}

	static public void afficher(ArrayList<Vehicule> l) {
		for (Vehicule v : l) {
			v.afficher();
		}
	}
	
	public void afficher() {
		Collection.afficher(collec);
	}

	public void ajouterCamion(String marque, String modele, String couleur) {
		collec.add(new Camion(marque, modele, couleur));
	}

	public void ajouterAuto(String marque, String modele, String couleur) {
		collec.add(new Auto(marque, modele, couleur));
	}

	public void ajouterMoto(String marque, String modele, String couleur) {
		collec.add(new Moto(marque, modele, couleur));
	}
	
	public boolean Marque(String marque) {
		for (Vehicule v : collec) {
			if (v.marque.equals(marque))
				return true;			
		}		
		return false;
	}

	public boolean Modele(String modele) {
		for (Vehicule v : collec) {
			if (v.modele.equals(modele))
				return true;
		}		
		return false;		
	}

	public void Supprimer(Vehicule del) {
		Iterator<Vehicule> iterator = collec.iterator();
		if (!iterator.hasNext())
			return;
		
		do {
			Vehicule v = iterator.next();			
			if (v.equals(del))
				iterator.remove();
		} while (iterator.hasNext());
	}
	
	public void Supprimer(String marque, String modele, String couleur) {
		Iterator<Vehicule> iterator = collec.iterator();
		if (!iterator.hasNext())
			return;
		
		do {
			Vehicule v = iterator.next();			
			if (v.match(marque, modele, couleur))
				iterator.remove();
		} while (iterator.hasNext());
	}
	
	public static void main(String[] args) {
		Collection c = new Collection();
		c.ajouterMoto("Renaud", "Clio", "Rouge");
		c.ajouterCamion("Toyota", "Yamatoto", "Bleu");
		c.ajouterAuto("Renaud", "Clio", "Rouge");
		c.ajouterAuto("Toyota", "Clio", "Bleu");
		c.ajouterMoto("Renaud", "Clio", "Noire");
		c.ajouterCamion("Renaud", "Clio", "Rouge");
		System.out.println("Collec");
		c.afficher();
		System.out.println("");
		
		System.out.println("Remove");
		c.Supprimer("Toyota", "Clio", "Bleu");
		c.afficher();
		System.out.println("");
		
		c.Supprimer(new Camion("Renaud", "Clio", "Rouge"));
		System.out.println("");
		
		System.out.println("Collec");
		c.afficher();
		System.out.println("");
		
	}	
} 
