import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exo1 {
	public static void main(String[] args) {
		Fenetre fen = new Fenetre();
		fen.setVisible(true);
	}
}

class Fenetre extends JFrame {
	private static int NOMBRE_IMAGE=10;
	private JButton bouton;
	private JPanel body;
	private JLabel[] img;
	private CardLayout layout;
	private EcouteMoiBien EvenementSouris;

	public Fenetre() {
		super("Exo1");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200,200);

		this.body= new JPanel();
		this.img = new JLabel[Fenetre.NOMBRE_IMAGE];
		this.layout=new CardLayout();
		this.body.setLayout(this.layout);

		for(int i=0; i<Fenetre.NOMBRE_IMAGE;i++) {
			this.img[i]=new JLabel(new ImageIcon("image_"+i+".jpg"));
			this.body.add(this.img[i],"image"+i);
		}

		this.EvenementSouris = new EcouteMoiBien(this);
		this.addMouseListener(this.EvenementSouris);
	
		this.add(this.body);
	}

	public void plus() {
		this.layout.next(this.body);
	}

	public void moins() {
		this.layout.previous(this.body);
	}
}

class EcouteMoiBien implements MouseListener {
	private Fenetre fen;
	private int width;
	private int posX;

	public EcouteMoiBien(Fenetre f) {
		this.fen=f;
	}

	public void	mouseClicked(MouseEvent e) {
		this.width=this.fen.getWidth();
		this.posX=e.getX();
		if (this.posX<this.width/2) {
			this.fen.moins();
		} else if (this.posX<=this.width) {
			this.fen.plus();
		}
	}
	public void	mouseEntered(MouseEvent e) {}
	public void	mouseExited(MouseEvent e) {}
	public void	mousePressed(MouseEvent e) {}
	public void	mouseReleased(MouseEvent e) {}
}