import java.awt.*;
import javax.swing.*;

public class CercleBouton extends JComponent {

	public CercleBouton() {
		this.setPreferredSize(new Dimension(50,55));
	}

	@Override
	public void paintComponent(Graphics pinceau) {
		Graphics pin = pinceau.create();
		int x = this.getWidth()/2-25;
		int y = this.getHeight()-55;

		pin.setColor(new Color(200,200,200));
		pin.fillOval(x,y,50,50);
		pin.setColor(Color.BLACK);
		pin.drawOval(x,y,50,50);
	}
}