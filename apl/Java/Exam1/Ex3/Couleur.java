import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Couleur extends JPanel{
    private static int nbCercle;
    Couleur(int nb){
	nbCercle=nb;
    }


    public void Cercle(Graphics g){
	Random rand=new Random();
	int posx=rand.nextInt((800-0)+1)+0;
	int posy=rand.nextInt((600-0)+1)+0;
	int size=rand.nextInt((50-10)+1)+10;

	g.setColor(Color.red);

	g.fillOval(posx,posy,size,size);
    }
    
    @Override
    public void paintComponent(Graphics g){
	System.out.println("Sa passe");
	
	g.setColor(Color.white);
	g.fillRect(0, 0, this.getWidth(), this.getHeight());

	for(int i=0;i<nbCercle;i++){
	    Cercle(g);
	}
    }
    
    
    public static void main (String [] args){
	JFrame fenetre=new JFrame();
	
	Couleur coul=new Couleur(8);

	fenetre.setSize(800,600);
	fenetre.setLocation(200,200);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fenetre.add(coul);
	fenetre.setVisible(true);
	
    }
}

