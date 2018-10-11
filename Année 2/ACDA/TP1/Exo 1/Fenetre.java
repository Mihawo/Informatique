import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame {
	private JButton up;
	private JButton down;
	private JLabel text;
	private String[] mots;
	private int num;
	private ActionModif event;

	public Fenetre(String[] m) {
		super("Question 1");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 300);
		this.setLocation(100, 100);

		this.mots = m;
		this.num = 0;
		this.up = new JButton("\u25B2");
		this.down = new JButton("\u25BC");
		this.text = new JLabel(this.mots[this.num]);
		this.text.setHorizontalAlignment(JLabel.CENTER);
		this.add(this.up, BorderLayout.NORTH);
		this.add(this.down, BorderLayout.SOUTH);
		this.add(this.text);

		this.event = new ActionModif(this);
		this.up.addActionListener(this.event);
		this.down.addActionListener(this.event);
	}

	public void augmenter() {
		this.num++;
		if (this.num >= this.mots.length)
			this.num = 0;
		this.text.setText(mots[this.num]);
	}

	public void diminuer() {
		this.num--;
		if (this.num < 0)
			this.num = this.mots.length - 1;
		this.text.setText(mots[this.num]);
	}
}