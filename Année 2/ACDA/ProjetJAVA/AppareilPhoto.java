import java.awt.*;
import javax.swing.*;

public class AppareilPhoto extends JPanel {
	private Fenetre fen;
	private CercleBouton bouton;
	private JPanel pan;

	public AppareilPhoto(Fenetre f) {
		this.fen=f;
		this.setLayout(new BorderLayout());

		this.setLayout(new ListenerDeux(this.fen));
		this.bouton=new CercleBouton();
		this.add(this.bouton,BorderLayout.SOUTH);
	}
}