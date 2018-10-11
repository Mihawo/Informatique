import java.awt.event.*;

public class ActionModif implements ActionListener {
	private Fenetre fen;

	ActionModif(Fenetre f) {
		this.fen = f;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String m = e.getActionCommand();
		if (m.equals("\u25B2")) {
			this.fen.augmenter();
		} else if (m.equals("\u25BC")) {
			this.fen.diminuer();
		}
	}
}