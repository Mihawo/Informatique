import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
	private JButton oui;
	private JButton non;
	private Camembert cam;
	private Auditeur event;

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

		this.event = new Auditeur(this.cam);
		this.oui.addActionListener(this.event);
		this.non.addActionListener(this.event);
	}
}