import java.util.*;
import javax.swing.*;
import java.awt.*;

public class ex4 {
	public static void main(String [] args){
		JFrame fenetre = new JFrame();
		
		fenetre.setSize(500,300);
		fenetre.setLocation(0,0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLayout(new BoxLayout(fenetre.getContentPane(),BoxLayout.LINE_AXIS));
		
		ButtonGroup groupe = new ButtonGroup();
		JPanel panel = new JPanel();

		panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
		panel.setBackground(Color.BLUE);
		//panel.setVerticalAlignment(BoxLayout.CENTER);		
		JRadioButton temp = new JRadioButton("Gryffondor");
		panel.add(temp);
		groupe.add(temp);
		
		temp = new JRadioButton("Serpentard");
		panel.add(temp);
		groupe.add(temp);
		
		temp = new JRadioButton("Serdaigle");
		panel.add(temp);
		groupe.add(temp);
		
		temp = new JRadioButton("Poufsouffle");
		panel.add(temp);
		groupe.add(temp);
		
		fenetre.add(Box.createHorizontalGlue());
		fenetre.add(panel);
		fenetre.add(Box.createHorizontalGlue());
		
		fenetre.setVisible(true);
		} 
	}