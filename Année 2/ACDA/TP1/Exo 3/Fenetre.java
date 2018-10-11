import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
	private Croix croix;
	private Souris event;

	public Fenetre() {
		super("Question 2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200,200);
		this.setLocation(100,100);

		this.croix=new Croix();
		this.add(this.croix);

		this.event=new Souris(this.croix);
		this.addMouseMotionListener(this.event);
	}
}