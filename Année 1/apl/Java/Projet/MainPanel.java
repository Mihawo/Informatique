import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPanel extends JPanel {

	public static int taille;
	private static final int tailleCarre = 50;

	int[][] grille = new int[taille][taille];

	int tour = 1;

	public MainPanel() {
		setSize(800, 1000);
		setBackground(Color.lightGray);

		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				int x = (e.getX() / tailleCarre);
				int y = (e.getY() / tailleCarre);

				if (e.getX() > x * 50 + 25) {
					x = x + 1;
				}
				if (e.getY() > y * 50 + 25) {
					y = y + 1;
				}

				String s = new String();
				System.out.println(s.format("x:%d - y:%d", x, y));

				try {

				} catch (ArrayIndexOutOfBoundsException aioobe) {
					System.out.println("Hors limites !!");
				}

				if (tour == 2) {
					tour = 1;
					grille[y][x] = 2;
				} else {
					tour = 2;
					grille[y][x] = 1;
				}

				repaint();
			}
		});
	}

	@Override
	public void paintComponent(Graphics g) {
		int x = 0;
		int y = 0;
		g.setColor(Color.BLACK);
		super.paintComponent(g);

		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille[i].length; j++) {
				g.drawRect(x, y, tailleCarre, tailleCarre);
				if (grille[i][j] == 1 || grille[i][j] == 2) {
					if (grille[i][j] == 2)
						g.setColor(Color.white);
					g.fillOval(x - 10, y - 10, 20, 20);
					g.setColor(Color.black);

				}

				x = x + tailleCarre;
			}
			x = 0;
			y = y + tailleCarre;
		}

	}
}
