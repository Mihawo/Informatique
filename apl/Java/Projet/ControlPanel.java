import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ControlPanel extends JPanel{

    static int b=0;
    MainPanel mPanel = new MainPanel();
    public ControlPanel(){
	setSize(200, 1000);

	ButtonGroup bg = new ButtonGroup();
	JRadioButton x9Button = new JRadioButton("9x9");
	JRadioButton x13Button = new JRadioButton("13x13");
  JRadioButton x19Button = new JRadioButton("19x19");
	setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));

	bg.add(x9Button);
	bg.add(x13Button);
  bg.add(x19Button);

	add(x9Button);
	add(x13Button);
  add(x19Button);

	x9Button.addActionListener(new ActionListener() {

	    public void actionPerformed (ActionEvent e)
		{
        mPanel.nbCases=9;
        mPanel.repaint();

		}
	    });

	x13Button.addActionListener(new ActionListener() {
	    public void actionPerformed (ActionEvent e)
		{
		    mPanel.nbCases=13;
        mPanel.repaint();

		}
	    });

  x13Button.addActionListener(new ActionListener() {

    public void actionPerformed (ActionEvent e)
    {
      mPanel.nbCases=19;
      mPanel.repaint();

  	}
	    });
          add(mPanel);
    }

}
