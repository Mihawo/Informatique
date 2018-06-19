import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

class Node{
    int val;

    Node filsGauche;
    Node filsDroit;
    
    public Node getFilsGauche(){
	return this.filsGauche;
    }

    public Node getFilsDroit(){
	return this.filsDroit;
    }

    public int getVal(){
	return this.val;
    }

    public Node(int val) {
	this.val = val;
	this.filsDroit = null;
	this.filsGauche = null;		
    }
		
    public Node(int val, Node fg, Node fd) {
	this.val = val;
	this.filsGauche = fg;
	this.filsDroit = fd;
    }

    public int countPlaceGraphique(FontMetrics fm){
    	int nbr=fm.stringWidth(""+val);
    	if(filsGauche!=null){
    		nbr+=filsGauche.countPlaceGraphique(fm);
    	}
    	if(filsDroit!=null){
    		nbr+=filsDroit.countPlaceGraphique(fm);
    	}
    	return nbr;
    }
}

class PanelTree extends JPanel {
    Font f = new Font("Helvetica",Font.PLAIN,12);
    FontMetrics fm=getFontMetrics(f);

    public void drawNode(Graphics g, int x, int y, String text){
	int t=fm.stringWidth(text);
	int h=fm.getHeight();
	g.setFont(f);
	g.drawOval(x-t/2-5,y-h/2-10,t+10,t+10);
	g.drawString(text,x-t/2,y+h/2);
	fm.stringWidth(text);
    }

    @Override
	public void paintComponent(Graphics g){
	super.paintComponent(g);
	drawNode(g,40,40,"3201");
    }
}	

class NodeDisplay {
    int posx;
    int posy;
    int val;
    
    NodeDisplay filsGauche;
    NodeDisplay filsDroit;
    
    public NodeDisplay(Node n){
	this.val=n.val;
	this.filsGauche=null;
	this.filsDroit=null;
    }

    public void setFilsGauche(NodeDisplay n,int x, int y){
	this.filsGauche=n;
	this.filsGauche.posx=x;
	this.filsGauche.posy=y;
    }

    public void setFilsDroit(NodeDisplay n,int x, int y){
	this.filsDroit=n;
	this.filsDroit.posx=x;
	this.filsDroit.posy=y;
    }

    public void setXY(int x,int y){
	this.posx=x;
	this.posy=y;
    }

    public NodeDisplay getFilsGauche(){
	return this.filsGauche;
    }

    public NodeDisplay getFilsDroit(){
	return this.filsDroit;
    }

    public int getX(){
	return this.posx;
    }
    
    public int getY(){
	return this.posy;
    }
    
    public int getVal(){
	return this.val;
    }
}

public class BinaryTree {	
    public static void main(String[] args) {
	JFrame fenetre = new JFrame();
		
	fenetre.setSize(500,300);
	fenetre.setLocation(500,300);
	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	Node nod= new Node(22, new Node(40, new Node(8321), new Node(922224)), new Node(5, new Node(224), new Node(3, new Node(22), new Node(43, new Node(22), new Node(43)))));
	PanelTree pt=new PanelTree();
	fenetre.add(pt);
	fenetre.setVisible(true);
	
    }
}