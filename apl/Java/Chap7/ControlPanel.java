javaimport java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ControlPanel extends JPanel{

    static int b=0;
    public ControlPanel(){
	setSize(200, 1000);

	ButtonGroup bg = new ButtonGroup();
	JRadioButton jrb1 = new JRadioButton("Set/Remove");
	JRadioButton jrb2 = new JRadioButton("Select/Apply");

	setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));

	bg.add(jrb1);
	bg.add(jrb2);

	add(jrb1);
	add(jrb2);

	jrb1.addActionListener(new ActionListener() {
	  
	    @Override
	    public void actionPerformed (ActionEvent e)
		{
		    b=1;
		}
	    });
	
	jrb2.addActionListener(new ActionListener() {
		
	    @Override
	    public void actionPerformed (ActionEvent e)
		{
		    b=2;
		}
	    });
	
    }
}