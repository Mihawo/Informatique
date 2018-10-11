import java.awt.event.*;

public class Auditeur implements ActionListener {
	private Camembert cam;

	Auditeur(Camembert c) {
		this.cam = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String m = e.getActionCommand();
		if (m.equals("oui")) {
			this.cam.oui();
		} else if (m.equals("non")) {
			this.cam.non();
		}
	}
}