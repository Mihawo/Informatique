import java.awt.*;
import javax.swing.*;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;

public class Exo2 {
	public static void main(String[] args) {
		Fenetre fen = new Fenetre();
		fen.setVisible(true);
	}
}

class Fenetre extends JFrame {
	private GridBagConstraints contraintes;
	private JPanel pan;

	public Fenetre() {
		super("Exo2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200,200);

		this.contraintes = new GridBagConstraints();
		this.pan=new JPanel();
		this.pan.setLayout(new GridBagLayout());

		this.contraintes.gridx=0;
		this.contraintes.gridy=0;
		this.contraintes.gridwidth=2;
		this.contraintes.gridheight=1;
		this.contraintes.fill=GridBagConstraints.BOTH;
		this.contraintes.weightx=1.0;
		this.contraintes.weighty=1.0;
		this.pan.add(new JButton("1"),this.contraintes);

		this.contraintes.gridx=2;
		this.contraintes.gridy=0;
		this.contraintes.gridwidth=1;
		this.contraintes.gridheight=2;
		this.pan.add(new JButton("2"),this.contraintes);

		this.contraintes.gridx=1;
		this.contraintes.gridy=2;
		this.contraintes.gridwidth=2;
		this.contraintes.gridheight=1;
		this.pan.add(new JButton("3"),this.contraintes);

		this.contraintes.gridx=0;
		this.contraintes.gridy=1;
		this.contraintes.gridwidth=1;
		this.contraintes.gridheight=2;
		this.pan.add(new JButton("4"),this.contraintes);

		this.contraintes.gridx=1;
		this.contraintes.gridy=1;
		this.contraintes.gridwidth=1;
		this.contraintes.gridheight=1;
		this.contraintes.ipadx=50;
		this.contraintes.ipady=50;
		this.contraintes.weightx=0.0;
		this.contraintes.weighty=0.0;
		this.pan.add(new JButton("5"),this.contraintes);

		this.add(this.pan);
		this.pack();
	}
}

class EcouteMoiBien implements ComponentListener {
	private Fenetre fen;

	public EcouteMoiBien(Fenetre f) {
		this.fen=f;
	}
	public void	componentHidden(ComponentEvent e) {}
	public void	componentMoved(ComponentEvent e) {}
	public void	componentResized(ComponentEvent e) {
		this.fen.pack();
	}
	public void	componentShown(ComponentEvent e) {}
}
