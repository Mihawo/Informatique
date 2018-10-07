import java.awt.event.*;

public class ListenerUn implements ActionListener {
	private Fenetre fen;

	public ListenerUn(Fenetre f) {
		this.fen=f;
	}

	public void actionPerformed(ActionEvent e) {
		this.fen.changerCard("AppareilPhoto");
	}
}