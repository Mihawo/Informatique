import javax.swing.*;
import java.awt.*;

public class EcranPrincipal extends JPanel {
	private Fenetre fen;
	private JButton bouton;

	public EcranPrincipal(Fenetre f) {
		this.fen=f;
		this.setLayout(new GridLayout(3,1));
		this.add(new JLabel());
		this.bouton=new JButton("Commencer l'inventaire");
		this.bouton.addActionListener(new ListenerUn(this.fen));
		this.add(this.bouton);
	}
}
