import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;

public class Croix extends JComponent {
	private int posX;
	private int posY;

	public Croix() {
		this.posX=0;
		this.posY=0;
	}

	@Override
	public void paintComponent(Graphics pinceau) {
		Graphics pin = pinceau.create();
		int width = this.getWidth();
		int height = this.getHeight();

		pin.setColor(Color.BLACK);
		pin.drawLine(this.posX,0,this.posX,height);
		pin.drawLine(0,this.posY,width,this.posY);
	}

	public void maj(int x, int y) {
		if (x!=this.posX || y!=this.posY) {
			this.posX=x;
			this.posY=y;
			this.repaint();
		}
	}
}