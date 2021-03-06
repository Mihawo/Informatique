// Fenetre.java
package test;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
@SuppressWarnings( "serial" )
public class Fenetre extends JFrame
{
    JPanel panel = new JPanel();
    Fenetre( String nom, int largeur, int hauteur )
    {
        this.setTitle( nom );
        this.setSize( largeur, hauteur );
        this.setLocationRelativeTo( null );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setContentPane( new Dessiner() );
        this.setVisible( true );
    }
    public void changerCouleur()
    {
        panel.setBackground( Color.orange );
    }
}