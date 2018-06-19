import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Go extends JFrame implements ActionListener{
    int compteur = 0;
    //Un tableau à 2 dimensions pour gérer la capture des pions
    int Pion[][] = {{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0}};
    JButton[][] cases = new JButton[9][9];
    ImageIcon noire = new ImageIcon("boulenoire.png");
    ImageIcon blanche = new ImageIcon("bouleblanche.png");
    ImageIcon vide = new ImageIcon("vide.png");
	
    public static void main(String[] args) {
	Go plateau = new Go();
	plateau.go();

    }
    public void go(){
	JPanel board = new JPanel();
	board.setLayout(new GridLayout(9, 9));
	board.setSize(300,300);
	for (int i = 0; i < 9; i++){
	    for (int j = 0; j < 9; j++){
		cases[i][j] = new JButton(vide);
	    }
	}
		   
	for (int i = 0; i < 9; i++){
	    for (int j = 0; j < 9; j++){
		cases[i][j].addActionListener(this);
	    }
	}
		   
	for (int i = 0; i < 9; i++){
	    for (int j = 0; j < 9; j++){
		board.add(cases[i][j]);
	    }
	}

		
	setContentPane(board);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(900,900);
	setVisible(true);
		
    }
	
    public void Piege(){
	int i = 0;
	int j = 0;
	if(Pion[i][j] == 1){
	    cases[i][j].setIcon(blanche);
	}
	if(Pion[i][j] == 2){
	    cases[i][j].setIcon(noire);
	}
		
	for (int ligne = 0; ligne < 9; ligne++){
	    for (int colonne = 0; colonne < 9; colonne++){
		//Ici il s'agit d'un exemple d'une pièce blanche entouré par 8 pièces noirs
		if ((Pion[i][j] == 1) && (Pion[i - 1][j] == 2) && (Pion[i + 1][j] == 2) && (Pion[i][j - 1] == 2) && (Pion[i][j + 1] == 2) && (Pion[i + 1][j + 1]== 2) && (Pion[i + 1][j - 1]==2) && (Pion[i - 1][j - 1]==2) && (Pion[i - 1][j + 1])==2){
		    cases[i][j].setIcon(vide);  //Alors la case redevient vide; 
		}
	    }
	}
    }

    public void actionPerformed(ActionEvent event){
	Object bouton;
	bouton = event.getSource();
	if (compteur < 81)
	    {
		for (int i = 0; i < 9; i++){
		    for (int j = 0; j < 9; j++){
			if(bouton == cases[i][j]){
			    if ( compteur%2 == 0  ){
				cases[i][j].setIcon(blanche); 
				compteur ++;
			    }
			    else {
				cases[i][j].setIcon(noire); 
				compteur ++;
			    }
			}
		    }
		}
		this.Piege(); //On appelle la fonction void Piege
	    }
    }
}