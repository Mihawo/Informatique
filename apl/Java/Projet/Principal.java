import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JPanel
{
    int passe=0;

    class TouchePanel implements MouseListener,MouseMotionListener
    {
	if(ControlPanel.bouton==1)
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
    return;
  
