import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
	private JPanel corps;
	private CardLayout layout;
	public Fenetre() {
		super("1.1");
		this.setSize(768,1024);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.corps=new JPanel();
		this.layout=new CardLayout();
		this.corps.setLayout(this.layout);
		this.corps.add(new EcranPrincipal(this),"EcranPrincipal");
		this.corps.add(new AppareilPhoto(this),"AppareilPhoto");
		this.layout.show(this.corps,"EcranPrincipal");
		this.add(this.corps,BorderLayout.CENTER);
	}

	public void changerCard(String tmp) {
		this.layout.show(this.corps,tmp);
	}
}