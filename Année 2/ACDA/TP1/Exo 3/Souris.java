import java.awt.event.MouseMotionListener;

public class Souris implements MouseMotionListener  {
	private Croix croix;

	public Souris(Croix c) {
		this.croix=c;
	}
	
	public void mouseDragged(MouseEvent e) {

	}
	public void mouseMoved(MouseEvent e) {
		this.croix.maj(e.getX(),e.getY());
	}
}