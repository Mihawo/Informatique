import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPanel extends JPanel
{
  static int nbCases=9;
  int [][] grille = new int[nbCases][nbCases];
  /*class TouchePanel implements MouseListener,MouseMotionListener
    {
	if () {

}(ControlPanel.bouton==1)
	    {
		tour=(tour+1)%2;
		ControlPanel.bouton=0;
	    }

	int x=(e.getX()/50);
	int y=(e.getY()/50);

	if(e.getX()>x*50+25)
	    x=x+1;
	if(e.getY()>y*50+25)
	    y=y+1;

	if(x<1 || x>taille-1 || y<1 || y>taille-1)
	    return;

	if(tour==0 && tab[y][x-1]==2 && tab[y][x+1]==2 && tab[y+1][x]==2 && tab[y+1][x]==2)
    return;*/
  public MainPanel(){
    setSize(800,1000);
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
          x+=50;
        }
          x=0;
          y+=50;
        }
      }
}
