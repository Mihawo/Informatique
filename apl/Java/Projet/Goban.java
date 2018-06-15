import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Goban extends JPanel {
  private int nbCases;
  private int [][] grille = new int [nbCases][nbCases];

  public Goban(int n){
    nbCases=n;
  }

  @Override
  public void paintComponent(Graphics g){
    int x=0;
  	int y=0;
    g.setColor(Color.BLACK);
  	super.paintComponent(g);

    for(int i=0; i<grille.length; i++){
      for(int j=0; j<grille[i].length; j++){
        //if(i!=grille.length-1 && j!=grille[i].length-1 && i!=0 && j!=0)
          g.drawRect(x, y, 49, 49);
        }
          x=x+50;
      }
      x=0;
      y=y+50;
    }
  }
