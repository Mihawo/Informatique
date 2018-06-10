public class SalleAttente2 {
	private LinkedList<String> tab;
		
	public SalleAttente(){
		this.tab = new LinkedList<String>();
	}
	
	public boolean faireEntrer(String nom){
		this.tab.add(nom);
		return true;
	}
	
	public String faireSortir(){
		return this.tab.pollFirst();
	}
	
	public void afficherSalle(){
		System.out.println("Salle d'attente : ");
		int j = 1;
		for (String elt : this.tab) {
			System.out.println("Personne num " + j + " : " + elt);
			++j;
		}
		System.out.println("");
 	}
}
