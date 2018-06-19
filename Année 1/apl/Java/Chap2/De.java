import java.util.*;

public class De {
	private int nbFaces;
	private Random r;
	
	public De() {
		r = new Random();
		nbFaces = 6;
	}
	
	public De(int nbFaces) {
		r = new Random();
		this.nbFaces = nbFaces;
	}
	
	public De(De de) {
		r = new Random();
		nbFaces = de.nbFaces;
	}
	
	public int getNbFaces() {
		return nbFaces;
	}
	
	public void setNbFaces(int nbFaces) {
		this.nbFaces = nbFaces;
	}
	
	int lancer() {
		return r.nextInt(nbFaces) + 1;
	}	
}

class Main {
	public static void main(String[] argv) {
		De de6 = new De(6);
		De de12 = new De(12);
		
		int[] tab6 = new int[6];
		int[] tab12 = new int[12];
		
		for (int i = 0; i < 6; ++i) {
			tab6[i] = 0;
		}
		
		for (int i = 0; i < 12; ++i) {
			tab12[i] = 0;
		}
		
		for (int i = 0; i < 1000; ++i) {
			tab6[de6.lancer() - 1]++;
			tab12[de12.lancer() - 1]++;
		}

		System.out.println("De6 - NB faces");
		for (int i = 0; i < 6; ++i)
			System.out.println("Nb " + (i+1) + " : " + tab6[i]);

		System.out.println("");
		System.out.println("");
		System.out.println("De12 - NB faces");
		for (int i = 0; i < 12; ++i)
			System.out.println("Nb " + (i+1) + " : " + tab12[i]);
	}	
}