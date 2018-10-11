public class Exercice1 {
	public static void main(String[] args) {
		if (args.length==0) {
			System.out.println("Mettez des arguments");
			return;
		}
		Fenetre fen = new Fenetre(args);
		fen.setVisible(true);
	}
}