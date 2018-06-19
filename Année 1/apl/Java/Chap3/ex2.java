import java.util.*;
import javax.swing.*;
import java.awt.*;

public class ex2 {
	public static void main (String [] args){
		JFrame fenetre = new JFrame();
		
		fenetre.setSize(500,300);
		fenetre.setLocation(0,0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fenetre.add(new JButton(""), BorderLayout.NORTH);
		fenetre.add(new JButton("Bottom"), BorderLayout.SOUTH);
		fenetre.add(new JButton("Droite"), BorderLayout.EAST);
		fenetre.add(new JButton("Gauche"), BorderLayout.WEST);
		fenetre.add(new JButton("Centre"), BorderLayout.CENTER);
		
		fenetre.setVisible(true);
		
		}
	}