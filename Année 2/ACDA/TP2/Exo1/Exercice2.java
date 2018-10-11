import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Exercice2 {
	public static void main(String[] args) {
		Fenetre fen = new Fenetre();
		fen.setVisible(true);
	}
}

class Fenetre extends JFrame {
	private JButton oui;
	private JButton non;
	private Camembert cam;
	private Auditeur event;
	private Fermeture ferme;

	public Fenetre() {
		super("Question 2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200,200);
		this.setLocation(100,100);

		this.oui=new JButton("oui");
		this.non=new JButton("non");
		JPanel pan = new JPanel(new GridLayout(1,2));
		pan.add(this.oui);
		pan.add(this.non);
		this.cam=new Camembert();
		this.add(this.cam,BorderLayout.CENTER);
		this.add(pan,BorderLayout.SOUTH);

		this.ferme=new Fermeture(this.cam);
		this.addWindowListener(this.ferme);

		this.event = new Auditeur(this.cam);
		this.oui.addActionListener(this.event);
		this.non.addActionListener(this.event);
	}
}

class Fermeture implements WindowListener {
	private Camembert cam;

	public Fermeture(Camembert c) {
		this.cam=c;
	}
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		this.cam.fermerVote();
	}
	public void	windowDeactivated(WindowEvent e) {}
	public void	windowDeiconified(WindowEvent e) {}
	public void	windowIconified(WindowEvent e) {}
	public void	windowOpened(WindowEvent e) {}
}

class Auditeur implements ActionListener {
	private Camembert cam;

	Auditeur(Camembert c) {
		this.cam=c;
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