import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class GestionLivre extends JFrame {

private static int nbLivres = 0;

  GestionLivre() {
    super();
    setSize(600, 1000);
    setTitle("Ma Bibliotheque");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);

    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.red);

    JLabel titre = new JLabel("Titre");
    JLabel auteur = new JLabel("Auteur");
    JLabel prix = new JLabel("Prix");
    JLabel auteur2 = new JLabel("Auteur:");
    JLabel prix2 = new JLabel("Prix:");
    JLabel nomAuteur = new JLabel();
    JLabel prixLivre = new JLabel();

    JTextField titText = new JTextField();
    JTextField autText = new JTextField();
    JTextField priText = new JTextField();

    JButton ajouter = new JButton("Ajouter");
    JButton sauvegarder = new JButton("Sauvegarder");
    JButton charger = new JButton("Charger");

    DefaultListModel<Livre> listModel;
    JList<Livre> liste;
    listModel = new DefaultListModel<Livre>();
    liste = new JList<Livre>(listModel);
    liste.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    liste.setBorder(BorderFactory.createLineBorder(Color.black));


    titre.setLocation(20,10);
    titre.setSize(50, 10);
    auteur.setLocation(120, 10);
    auteur.setSize(50, 10);
    prix.setLocation(220, 10);
    prix.setSize(50, 10);

    auteur2.setBounds(350, 515, 50, 10);
    prix2.setBounds(350, 565, 50, 10);

    nomAuteur.setBounds(410, 515, 50, 20);
    prixLivre.setBounds(410, 565, 50, 10);

    titText.setLocation(10, 25);
    titText.setSize(70, 40);
    autText.setLocation(110, 25);
    autText.setSize(70, 40);
    priText.setLocation(210, 25);
    priText.setSize(70, 40);

    ajouter.setBounds(310, 25, 90, 40);
    sauvegarder.setBounds(170, 500, 150, 40);
    charger.setBounds(170, 550, 150, 40);

    liste.setBounds(10, 65, 150, 900);

    panel.add(titre);
    panel.add(auteur);
    panel.add(prix);
    panel.add(auteur2);
    panel.add(prix2);
    panel.add(nomAuteur);
    panel.add(prixLivre);

    panel.add(titText);
    panel.add(autText);
    panel.add(priText);

    panel.add(ajouter);
    panel.add(liste);

    panel.add(sauvegarder);
    panel.add(charger);

    ajouter.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent e) {
        String titreLivre = titText.getText();
        String auteurLivre = autText.getText();
        float  prixLivre = Float.parseFloat(priText.getText());

        Livre ouiLivre = new Livre(titreLivre, auteurLivre , prixLivre);
        listModel.addElement(ouiLivre);
        nbLivres+=1;

      }
    });

    liste.addListSelectionListener(new ListSelectionListener() {

      public void valueChanged(ListSelectionEvent e) {
        for (int i=0; i<nbLivres ; i++) {
          if (liste.isSelectedIndex(i)) {
            Livre afficher = listModel.getElementAt(i);
            String titreLivre = afficher.getAuteur();
            float prixLivre2 = afficher.getPrix();

            nomAuteur.setText(titreLivre);
            prixLivre.setText(String.valueOf(prixLivre2));
          }
        }
      }
    });

    sauvegarder.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent e) {

        try {

          FileOutputStream fos = new FileOutputStream(new File("./sauver.txt"));
          BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
          for (int j=0 ; j<nbLivres ; j++)  {
            Livre ecrire = listModel.getElementAt(j);
            String s = "Auteur: "+ ecrire.getAuteur()+ " Titre: "+ ecrire.getTitre()+ " Prix: "+ ecrire.getPrix();
            bw.write(s, 0, s.length());
            bw.newLine();
          }
          bw.close();
        } catch(IOException ioe) {
          System.out.println("Erreur d'ecriture: " + ioe.getMessage());
        }
      }
    });

    add(panel);

    setVisible(true);

  }


  public static void main(String[] args) {
    new GestionLivre();
  }

}
