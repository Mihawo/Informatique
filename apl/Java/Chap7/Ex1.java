import java.util.*;
import javax.swing.*;
import java.awt.*;

// class MainPanel() extends JPanel

public class Ex1 extends JFrame{
    public Ex1() {
	super("Algorithme A*");
	setSize(1000, 1000);
	setLocation(0,0);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new BoxLayout(this.getContentPane(),BoxLayout.X_AXIS));

	MainPanel mainPanel = new MainPanel();
	ControlPanel controlPanel = new ControlPanel();

	add(mainPanel);
	add(controlPanel);

	setVisible(true);
    }

    public static void main (String [] args){
	Ex1 Fenetre = new Ex1();
    }
}