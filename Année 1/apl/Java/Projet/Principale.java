import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principale extends JFrame{
  public static final String titre = "Jeu de Go";

  private Principale() {
    setSize(1000, 1000);
    setTitle(titre);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
      JPanel panel = new JPanel();
      panel.setBackground(Color.white);
      panel.setLayout(null);
      JLabel label = new JLabel("Jeu de Go");

    JButton jouer = new JButton("Jouer 9x9");
    JButton jouer2 = new JButton("Jouer 13x13");
    JButton jouer3 = new JButton("Jouer 19x19");

    label.setBounds(300, 200, 200, 50);
    label.setFont(new Font("Arial", Font.BOLD, 23));;

    jouer.setBounds(250, 300, 150, 20);
    jouer2.setBounds(450, 300, 150, 20);
    jouer3.setBounds(650, 300, 150, 20);

          jouer.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
              MainPanel.taille=9;
              boutonPresse();
            }
          });

          jouer2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
              MainPanel.taille=13;
              boutonPresse();
            }
          });

          jouer3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
              MainPanel.taille=19;
              boutonPresse();
            }
          });

    panel.add(jouer);
    panel.add(jouer2);
    panel.add(jouer3);


      panel.add(label);

      add(panel);
setVisible(true);

  }

  private void boutonPresse(){
    this.dispose();
JFrame frame = new JFrame("Jeu de go");
frame.setSize(1000, 1000);
frame.setTitle(titre);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocationRelativeTo(null);
frame.setResizable(false);

MainPanel pan = new MainPanel();

frame.add(pan);
frame.setVisible(true);

  }

  public static void main(String[] args) {
      new Principale();
  }
}
