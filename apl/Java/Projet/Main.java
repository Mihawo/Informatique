import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
  public Main() {
    setTitle("Jeu de Go");
    setSize(1000,1000);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ControlPanel cPanel= new ControlPanel();


    add(cPanel);
    setVisible(true);
  }

  public static void main(String[] args) {
    Main maain= new Main();

} }
