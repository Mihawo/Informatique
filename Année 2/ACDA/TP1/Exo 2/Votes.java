public class Votes {
	private int oui;
	private int non;

	public Votes() {
		this.oui=0;
		this.non=0;
	}

	public void voteOui() {
		this.oui++;
	}
	public void voteNon() {
		this.non++;
	}

	public int getOui() {
		return this.oui;
	}
	public int getNon() {
		return this.non;
	}
}